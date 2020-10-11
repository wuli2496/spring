package mine.spring_study.hibernate.chapter03.parameter;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class RentalStation {
    public RentalStation(@NotNull String name) {

    }

    public void rentCar(@NotNull Customer customer,
                        @NotNull @Future Date startDate,
                        @Min(1) int durationInDays) {

    }
}
