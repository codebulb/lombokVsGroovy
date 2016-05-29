package ch.codebulb.lombokvsgroovy.def;

import lombok.val;

public class DefLombok {
    public static <T> T getValue(T value) {
        val ret = value;
        return ret;
    }
}
