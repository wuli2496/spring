package mine.spring_study.hibernate.chapter02.containerelement.nested;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {
    private Map<@NotNull Part, List<@NotNull Manufacturer>> partManufacturers = new HashMap<>();

    public void addPartManufacturer(Part part, Manufacturer manufacturer) {
        if (!partManufacturers.containsKey(part)) {
            partManufacturers.put(part, new ArrayList<>());
        }

        partManufacturers.get(part).add(manufacturer);
    }
}
