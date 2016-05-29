package ch.codebulb.lombokvsgroovy.immutable

import groovy.transform.CompileStatic
import groovy.transform.Immutable

@CompileStatic
@Immutable
class ImmutableGroovy {
    String name
    int age = 10
}

