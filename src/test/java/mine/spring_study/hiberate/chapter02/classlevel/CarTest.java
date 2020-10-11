package mine.spring_study.hiberate.chapter02.classlevel;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.classlevel.Car;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {
    @Test
    public void testCar() {
        Car car = new Car();

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
        assertEquals(1, constraintViolations.size());
    }
}
