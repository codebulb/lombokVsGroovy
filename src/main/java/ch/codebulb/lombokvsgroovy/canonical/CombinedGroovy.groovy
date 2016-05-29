package ch.codebulb.lombokvsgroovy.canonical

import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@CompileStatic
@ToString(includePackage=false, includeNames=true)
@EqualsAndHashCode(includes="name")
@TupleConstructor
class CombinedGroovy {
    String name
    int age = 10
}

