package ch.codebulb.lombokvsgroovy.nonnull;

import lombok.NonNull;

public class NonNullLombok {
    public static String checkNonNull(@NonNull String cannotBeNull, String canBeNull) {
        return cannotBeNull + canBeNull;
    }
}
