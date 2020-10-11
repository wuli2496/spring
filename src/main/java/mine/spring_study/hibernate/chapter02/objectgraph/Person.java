package mine.spring_study.hibernate.chapter02.objectgraph;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Person {
    @NotNull
    private String name;
}
