package ch.codebulb.lombokvsgroovy.delegate;

import java.util.ArrayList;
import java.util.List;
import lombok.experimental.Delegate;

public class DelegateLombok {
    @Delegate
    private List<Integer> values = new ArrayList<>();
}
