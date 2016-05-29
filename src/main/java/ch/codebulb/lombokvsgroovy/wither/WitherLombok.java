package ch.codebulb.lombokvsgroovy.wither;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Wither;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Wither
public class WitherLombok {
    private String name = "Default name";
    private int age;
}
