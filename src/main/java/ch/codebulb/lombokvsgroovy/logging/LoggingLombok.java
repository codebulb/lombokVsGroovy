package ch.codebulb.lombokvsgroovy.logging;

import lombok.extern.java.Log;


@Log
public class LoggingLombok {
    public static Class checkLogger() {
        return log.getClass();
    }
}
