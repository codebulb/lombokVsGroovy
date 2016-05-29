package ch.codebulb.lombokvsgroovy.exceptions;

import lombok.SneakyThrows;

public class ExceptionsLombok {
    public static Class<? extends Exception> tryToDoSomething() {
        try {
            doSomethingDangerous();
            throw new IllegalStateException();
        }
        catch (Exception ex) {
            return ex.getClass();
        }
    }
    
    @SneakyThrows
    private static void doSomethingDangerous() {
        throw new UselessException();
    }
    
    public static class UselessException extends Exception {
        
    }
}
