package ch.codebulb.lombokvsgroovy.builder;

import java.util.ArrayList;
import java.util.List;
import lombok.Singular;
import lombok.Builder;

@Builder
public class BuilderLombok {
    String name;
    int age;
    @Singular
    List<String> siblings = new ArrayList<>();
}
