package com.cf.study.java8;

import java.util.List;
import java.util.function.Predicate;

public abstract class Contact {

    public static void callContacts(final List<Person> contacts, final Predicate<Person> predicate) {
        for (final Person p : contacts) {
            if (predicate.test(p)) {
                call(p);
            }
        }
    }

    private static void call(final Person p) {
        System.out.println("Calling " + p);
    }

}
