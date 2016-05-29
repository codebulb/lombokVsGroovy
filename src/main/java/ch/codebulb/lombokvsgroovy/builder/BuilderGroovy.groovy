package ch.codebulb.lombokvsgroovy.builder

import groovy.transform.CompileStatic
import groovy.transform.builder.Builder;

@CompileStatic
@Builder
class BuilderGroovy {
    String name
    int age
    List<String> siblings = []
}

