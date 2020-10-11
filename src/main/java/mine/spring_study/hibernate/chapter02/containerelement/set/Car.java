package mine.spring_study.hibernate.chapter02.containerelement.set;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class Car {
    private Set<@NotNull String> parts = new HashSet<>();

    public void addPart(String part) {
        parts.add(part);
    }
}
