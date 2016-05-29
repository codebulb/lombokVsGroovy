package ch.codebulb.lombokvsgroovy.builder;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent=true)
@Getter @Setter
public class SimpleBuilderLombok {
    String name;
    int age;
    List<String> siblings = new ArrayList<>();
}
