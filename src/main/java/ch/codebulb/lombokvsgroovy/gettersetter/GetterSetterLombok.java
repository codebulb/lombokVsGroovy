// Generated by delombok at Wed May 18 22:38:42 GST 2016
package ch.codebulb.lombokvsgroovy.gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetterSetterLombok {
    @Setter(AccessLevel.PUBLIC)
    public String name;
    private int age = 10;
}
