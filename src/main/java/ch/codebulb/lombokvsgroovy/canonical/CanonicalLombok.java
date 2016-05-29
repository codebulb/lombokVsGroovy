package ch.codebulb.lombokvsgroovy.canonical;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CanonicalLombok {
    private String name;
    private int age = 10;
}
