package com.cf.study.java8;

public class Person {

    private String surname;
    private String givenname;
    private int age;

    public Person(final String surname, final String givenname, final int age) {
        this.surname = surname;
        this.givenname = givenname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenname() {
        return givenname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return givenname + " " + surname + " (" + age + ")";
    }
}
