package mine.spring_study.hibernate.chapter02.containerelement.nested;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
    @NotNull
    private String name;

}
