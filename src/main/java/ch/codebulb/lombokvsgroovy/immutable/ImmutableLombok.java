package ch.codebulb.lombokvsgroovy.immutable;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ImmutableLombok {
    private String name;
    private int age = 10;

    public ImmutableLombok() {
        this.name = null;
    }
}
