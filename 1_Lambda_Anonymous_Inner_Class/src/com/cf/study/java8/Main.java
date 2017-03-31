package com.cf.study.java8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        final List<Person> list = new ArrayList<Person>();
        list.add(new Person("Lee", "Bruce"));
        list.add(new Person("Chan", "Jackie"));
        list.add(new Person("Willis", "Bruce"));
        list.add(new Person("Statham", "Jason"));
        list.add(new Person("Cruise", "Tom"));

        System.out.println("Original: " + list);
        PersonUtils.sort(list);
        System.out.println("Sorted: " + list);
    }

}
