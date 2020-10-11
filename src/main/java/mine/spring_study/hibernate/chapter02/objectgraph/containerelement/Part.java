package mine.spring_study.hibernate.chapter02.objectgraph.containerelement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Part {

    @NotNull
    private String name;
}
