package mine.spring_study.hiberate.chapter02.objectgraph.containerelement;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.objectgraph.containerelement.Car;
import mine.spring_study.hibernate.chapter02.objectgraph.containerelement.Manufacturer;
import mine.spring_study.hibernate.chapter02.objectgraph.containerelement.Part;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {
    @Test
    public void testCarPerson() {
        Car car = new Car();
        car.getPassengers().add(null);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
        assertEquals(1, constraintViolations.size());
        printConstraintViolation(constraintViolations);
    }

    @Test
    public void testCarPart() {
        Car car = new Car();
        car.getPartManufactuers().put(new Part(), Arrays.asList(Manufacturer.builder().name("hello").build()));

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
        assertEquals(1, constraintViolations.size());
        printConstraintViolation(constraintViolations);
    }

    @Test
    public void testCarManufacturer() {
        Car car = new Car();
        car.getPartManufactuers().put(Part.builder().name("hello").build(), Arrays.asList(new Manufacturer()));

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
        assertEquals(1, constraintViolations.size());
        printConstraintViolation(constraintViolations);
    }
}
