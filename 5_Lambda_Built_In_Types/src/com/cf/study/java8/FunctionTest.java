package com.cf.study.java8;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class FunctionTest {

    public static void main(final String[] args) {

        final List<Employee> eList = Employee.createShortList();
        final Employee first = eList.get(0);

        final ToDoubleFunction<Employee> eFunc = e -> e.getSalary() * Bonus.byRole(e.getRole());

        System.out.println("=== First Employee Bonus");
        first.printSummary();
        System.out.println("Bonus: " + eFunc.applyAsDouble(first));

    }
}
