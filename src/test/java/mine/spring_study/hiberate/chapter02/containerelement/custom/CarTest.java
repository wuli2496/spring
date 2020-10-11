package mine.spring_study.hiberate.chapter02.containerelement.custom;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.containerelement.custom.Car;
import mine.spring_study.hibernate.chapter02.containerelement.custom.Gear;
import mine.spring_study.hibernate.chapter02.containerelement.custom.GearBox;
import mine.spring_study.hibernate.chapter02.containerelement.custom.GearBoxValueExtractor;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {

    private static Validator customValidator;

    @BeforeClass
    public static void init() {
        ValidatorFactory validatorFactory = Validation.byDefaultProvider().configure()
                .addValueExtractor(new GearBoxValueExtractor())
                .buildValidatorFactory();
        customValidator = validatorFactory.getValidator();
    }

    @Test
    public void testGearBox() {
        Car car = new Car();
        car.setGearBox(new GearBox<>(new Gear.AcmeGear()));

        Set<ConstraintViolation<Car>> constraintViolations = customValidator.validate(car);
        assertEquals(1, constraintViolations.size());
        ConstraintViolation<Car> constraintViolation = constraintViolations.iterator().next();
        assertEquals("Gear is not providing enough torque", constraintViolation.getMessage());
        assertEquals("gearBox", constraintViolation.getPropertyPath().toString());
    }
}
