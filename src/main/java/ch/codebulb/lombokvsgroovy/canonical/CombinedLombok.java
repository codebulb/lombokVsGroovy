package ch.codebulb.lombokvsgroovy.canonical;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString(includeFieldNames=true)
@EqualsAndHashCode(of={"name"})
@NoArgsConstructor
@AllArgsConstructor
public class CombinedLombok {
    private String name;
    private int age = 10;
}
