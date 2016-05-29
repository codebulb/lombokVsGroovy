package ch.codebulb.lombokvsgroovy.delegate

import groovy.transform.CompileStatic

@CompileStatic
class DelegateGroovy {
    @Delegate
    private List<Integer> values = []
}

