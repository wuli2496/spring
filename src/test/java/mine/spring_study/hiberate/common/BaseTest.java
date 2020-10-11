package mine.spring_study.hiberate.common;

import org.junit.BeforeClass;

import javax.validation.*;
import java.util.Iterator;
import java.util.Set;

public class BaseTest {

    protected static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    protected <T> void printConstraintViolation(Set<ConstraintViolation<T>> constraintViolations) {
        Iterator<ConstraintViolation<T>> iter = constraintViolations.iterator();
        while (iter.hasNext()) {
            ConstraintViolation<T> constraintViolation = iter.next();
            System.out.println("message: " + constraintViolation.getMessage() + " propertyPath: " + constraintViolation.getPropertyPath().toString());
        }
    }
}
