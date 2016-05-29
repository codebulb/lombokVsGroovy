package ch.codebulb.lombokvsgroovy.extensions

import groovy.transform.CompileStatic

@CompileStatic
class ExtensionsGroovy {
    public static String greetGroovy(String self) {
        return "Hello Groovy, this is " + self
    }
}

