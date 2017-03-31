package com.cf.study.java8;

public class Person {

    private String surname;
    private String givenname;

    public Person(final String surname, final String givenname) {
        this.surname = surname;
        this.givenname = givenname;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenname() {
        return givenname;
    }

    @Override
    public String toString() {
        return givenname + " " + surname;
    }
}
