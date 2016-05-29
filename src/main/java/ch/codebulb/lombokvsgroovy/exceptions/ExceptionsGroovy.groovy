package ch.codebulb.lombokvsgroovy.exceptions

import groovy.transform.CompileStatic

@CompileStatic
class ExceptionsGroovy {
    public static Class<? extends Exception> tryToDoSomething() {
        try {
            doSomethingDangerous();
            throw new IllegalStateException();
        }
        catch (Exception ex) {
            return ex.getClass();
        }
    }
    
    private static void doSomethingDangerous() {
        throw new UselessException();
    }
    
    public static class UselessException extends Exception {
        
    }
}

