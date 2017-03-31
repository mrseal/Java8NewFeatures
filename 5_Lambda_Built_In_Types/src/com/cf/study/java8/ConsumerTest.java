package com.cf.study.java8;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(final String[] args) {

        final List<Employee> eList = Employee.createShortList();
        final Employee first = eList.get(0);

        final Consumer<Employee> eCons = e -> System.out.println(e.getGivenName() + " " + e.getSurName() + ": " + e.getSalary());

        System.out.println("=== First Salary");
        eCons.accept(first);

    }
}
