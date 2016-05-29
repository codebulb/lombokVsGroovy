package ch.codebulb.lombokvsgroovy.builder

import groovy.transform.CompileStatic
import groovy.transform.builder.*

@CompileStatic
@Builder(builderStrategy=SimpleStrategy, prefix="")
class SimpleBuilderGroovy {
    String name
    int age
    List<String> siblings = []
}

