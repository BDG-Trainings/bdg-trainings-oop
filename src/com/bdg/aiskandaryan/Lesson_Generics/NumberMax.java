package com.bdg.aiskandaryan.Lesson_Generics;

public class NumberMax <N extends Number> {

    public <N extends Comparable<N>> N Maximum(final N a, final N b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
