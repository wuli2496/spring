package mine.spring_study.hiberate.chapter02.containerelement.nested;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.containerelement.nested.Car;
import mine.spring_study.hibernate.chapter02.containerelement.nested.Part;
import org.junit.Test;

import javax.validation.ConstraintViolation;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {
    @Test
    public void testNested() {
        Car car = new Car();
        car.addPartManufacturer(new Part("a"), null);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        ConstraintViolation<Car> constraintViolation = constraintViolations.iterator().next();
        assertEquals("不能为null", constraintViolation.getMessage());
    }
}
