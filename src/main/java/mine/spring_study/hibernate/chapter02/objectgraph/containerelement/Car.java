package mine.spring_study.hibernate.chapter02.objectgraph.containerelement;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Car {
    private List<@NotNull @Valid Person> passengers = new ArrayList<>();

    private Map<@Valid Part, List<@Valid Manufacturer>> partManufactuers = new HashMap<>();
}
