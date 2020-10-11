package mine.spring_study.hiberate.chapter02.containerelement.optional;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.containerelement.optional.Car;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class CarTest extends BaseTest {

    @Test
    public void testTowingCapacity() {
        Car car = new Car();
        car.setTowingCapacity(100);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());

        ConstraintViolation<Car> constraintViolation = constraintViolations.iterator().next();
        assertEquals("最小不能小于1000", constraintViolation.getMessage());
        assertEquals("towingCapacity", constraintViolation.getPropertyPath().toString());
    }
}
