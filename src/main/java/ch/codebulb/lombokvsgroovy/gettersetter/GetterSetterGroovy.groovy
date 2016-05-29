package ch.codebulb.lombokvsgroovy.gettersetter

import groovy.transform.CompileStatic

@CompileStatic
class GetterSetterGroovy {
    int age = 10
    public String name
    
    public void setName(String name) {
        this.name = name
    }
}

