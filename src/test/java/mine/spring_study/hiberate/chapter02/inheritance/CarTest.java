package mine.spring_study.hiberate.chapter02.inheritance;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.inheritance.Car;
import mine.spring_study.hibernate.chapter02.inheritance.RentalCar;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {
    @Test
    public void testCar() {
        Car car = new RentalCar();

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
        assertEquals(2, constraintViolations.size());

        Iterator<ConstraintViolation<Car>> iter = constraintViolations.iterator();
        while (iter.hasNext()) {
            ConstraintViolation<Car> violation = iter.next();
            System.out.println("message: " + violation.getMessage() + " path: " + violation.getPropertyPath().toString());
        }
    }
}
