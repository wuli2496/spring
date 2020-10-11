package mine.spring_study.hibernate.chapter02.containerelement.map;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

public class Car {
    public enum FuelConsumption {
        CITY,
        HIGHWAY
    }

    private Map<@NotNull FuelConsumption, Integer>
            fuelConsumption = new HashMap<>();

    public void setFuelConsumption(FuelConsumption consumption, int value) {
        fuelConsumption.put(consumption, value);
    }
}
