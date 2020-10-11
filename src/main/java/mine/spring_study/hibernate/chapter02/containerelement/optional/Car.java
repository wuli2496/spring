package mine.spring_study.hibernate.chapter02.containerelement.optional;

import javax.validation.constraints.Min;
import java.util.Optional;

public class Car {
    private Optional<@Min(1000) Integer> towingCapacity = Optional.empty();

    public void setTowingCapacity(Integer alias) {
        towingCapacity = Optional.of(alias);
    }
}
