package com.cf.study.java8;

import java.util.Collections;
import java.util.List;

public abstract class PersonUtils {

    public static void sort(final List<Person> list) {
        // Comparator is a Functional Interface & declared as @FunctionalInterface
        Collections.sort(list, (final Person p1, final Person p2) -> p1.getSurname().compareTo(p2.getSurname()));
    }

}
