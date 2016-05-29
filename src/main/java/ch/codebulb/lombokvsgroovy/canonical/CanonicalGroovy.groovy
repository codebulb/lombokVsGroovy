package ch.codebulb.lombokvsgroovy.canonical

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@CompileStatic
@Canonical
class CanonicalGroovy {
    String name
    int age = 10
}

