package ch.codebulb.lombokvsgroovy.def

import groovy.transform.CompileStatic

@CompileStatic
class DefGroovy {
    public static def value = "Hello"
    
    public static <T> T getValue(T value) {
        def ret = value;
        return ret;
    }
}

