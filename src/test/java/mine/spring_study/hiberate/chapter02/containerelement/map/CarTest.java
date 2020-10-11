package mine.spring_study.hiberate.chapter02.containerelement.map;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.containerelement.map.Car;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {
    @Test
    public void testFuelNull() {
        Car car = new Car();
        car.setFuelConsumption(null, 20);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        ConstraintViolation<Car> constraintViolation = constraintViolations.iterator().next();
        assertEquals("不能为null", constraintViolation.getMessage());
        assertEquals("fuelConsumption<K>[].<map key>", constraintViolation.getPropertyPath().toString());
    }
}
