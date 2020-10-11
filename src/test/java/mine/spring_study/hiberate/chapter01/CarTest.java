package mine.spring_study.hiberate.chapter01;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter01.Car;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {

    @Test
    public void manufacturerIsNull() {
        Car car = new Car(null, "DD-AB-123", 4);
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        assertEquals("不能为null", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void licensePlateTooShort() {
        Car car = new Car("Morris", "D", 4);
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        assertEquals("个数必须在2和14之间", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void seatCountTooLow() {
        Car car = new Car("Morris", "DD-AB-123", 1);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        assertEquals("最小不能小于2", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void carIsValid() {
        Car car = new Car("Morris", "DD-AB-123", 2);
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(0, constraintViolations.size());
    }
}
