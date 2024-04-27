package ro.ctrln.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Developer {
    private String name;
    private String lastName;
    private String programmingLanguage;
    private int skillLevel;
}
