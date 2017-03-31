package com.cf.study.java8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        final List<Person> list = new ArrayList<Person>();
        list.add(new Person("Lee", "Bruce", 9));
        list.add(new Person("Chan", "Jackie", 32));
        list.add(new Person("Willis", "Bruce", 15));
        list.add(new Person("Statham", "Jason", 19));
        list.add(new Person("Cruise", "Tom", 26));

        System.out.println("=== Call Adults ===");
        Contact.callContacts(list, p -> p.getAge() >= 18);

        System.out.println();
        System.out.println("=== Call Youth ===");
        Contact.callContacts(list, p -> p.getAge() < 18 && p.getAge() >= 10);
    }

}
