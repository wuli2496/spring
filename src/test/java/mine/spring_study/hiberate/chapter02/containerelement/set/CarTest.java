package mine.spring_study.hiberate.chapter02.containerelement.set;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.containerelement.set.Car;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {

    @Test
    public void testPartsNull() {
        Car car = new Car();
        car.addPart("Wheel");
        car.addPart(null);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        ConstraintViolation<Car> constraintViolation = constraintViolations.iterator().next();
        assertEquals("不能为null", constraintViolation.getMessage());
        assertEquals("parts[].<iterable element>", constraintViolation.getPropertyPath().toString());
    }
}
