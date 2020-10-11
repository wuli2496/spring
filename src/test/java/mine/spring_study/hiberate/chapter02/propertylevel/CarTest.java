package mine.spring_study.hiberate.chapter02.propertylevel;

import mine.spring_study.hiberate.common.BaseTest;
import mine.spring_study.hibernate.chapter02.fieldlevel.Car;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarTest extends BaseTest {

    @Test
    public void manufacturerIsNull() {
        Car car = new Car(null, true);
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        assertEquals(1, constraintViolations.size());
        assertEquals("不能为null", constraintViolations.iterator().next().getMessage());
    }
}
