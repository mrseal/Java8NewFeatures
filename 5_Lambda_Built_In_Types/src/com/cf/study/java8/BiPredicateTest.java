package com.cf.study.java8;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest {

    public static void main(final String[] args) {

        final List<Employee> eList = Employee.createShortList();

        final BiPredicate<Employee, String> biPredicate = (e, s) -> s.equals(e.getState());

        System.out.println("=== Print matching list");
        for (final Employee e : eList) {
            if (biPredicate.test(e, "KS")) {
                e.printSummary();
            }
        }
    }
}
