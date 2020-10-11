package mine.spring_study.hibernate.chapter02.containerelement.list;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<@NotNull String> parts = new ArrayList<>();

    public void addPart(String part) {
        parts.add(part);
    }
}
