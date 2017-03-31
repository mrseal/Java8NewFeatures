package com.cf.study.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(final String[] args) {
        final List<Person> list = new ArrayList<Person>();
        list.add(new Person("Lee", "Bruce", 9));
        list.add(new Person("Chan", "Jackie", 32));
        list.add(new Person("Willis", "Bruce", 15));
        list.add(new Person("Statham", "Jason", 19));
        list.add(new Person("Cruise", "Tom", 26));

        System.out.println("\n=== Contact List ===");
        list.forEach(p -> System.out.println(p));

        final Predicate<Person> adult = p -> p.getAge() >= 18;
        final Predicate<Person> youth = p -> p.getAge() < 18 && p.getAge() >= 10;

        // Reference Method - Contact::call
        System.out.println("\n=== Call Adults ===");
        list.stream().filter(adult).forEach(Contact::call);

        System.out.println("\n=== Call Youth ===");
        list.stream().filter(youth).forEach(Contact::call);
    }

}
