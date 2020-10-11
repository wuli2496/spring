package mine.spring_study.hibernate.chapter02.fieldlevel;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Data
public class Car {
    @NotNull
    private String manufacturer;

    @AssertTrue
    private boolean isRegistered;

    public Car(String manufacturer, boolean isRegistered) {
        this.manufacturer = manufacturer;
        this.isRegistered = isRegistered;
    }
}
