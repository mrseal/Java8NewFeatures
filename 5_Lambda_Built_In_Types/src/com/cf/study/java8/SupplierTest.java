package com.cf.study.java8;

import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(final String[] args) {

        final List<Employee> eList = Employee.createShortList();

        final Supplier<Employee> supplier = () -> new Employee.Builder().surName("Collin").givenName("Michael").salary(20000.0).build();

        System.out.println("=== Initial Employee List");
        eList.forEach(Employee::printSummary);

        eList.add(supplier.get());
        System.out.println("=== New List");
        eList.forEach(Employee::printSummary);
    }
}
