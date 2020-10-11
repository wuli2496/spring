package mine.spring_study.hibernate.chapter02.objectgraph;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class Car {
    @NotNull
    @Valid
    private Person driver;
}
