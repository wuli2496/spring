package mine.spring_study.hiberate.chapter02.objectgraph;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.objectgraph.Car;
import mine.spring_study.hibernate.chapter02.objectgraph.Person;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {
    @Test
    public void testCar() {
        Car car = new Car();
        Person person = new Person();
        car.setDriver(person);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        Iterator<ConstraintViolation<Car>> iter = constraintViolations.iterator();
        while (iter.hasNext()) {
            ConstraintViolation<Car> constraintViolation = iter.next();
            System.out.println("message: " + constraintViolation.getMessage() + " propertyPath: " + constraintViolation.getPropertyPath().toString());
        }
    }
}
