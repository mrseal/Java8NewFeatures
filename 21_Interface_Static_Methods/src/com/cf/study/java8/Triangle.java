package com.cf.study.java8;

public interface Triangle extends Shape {

    static void printType() {
        System.out.println(Triangle.class.getSimpleName());
    }

    @Override
    default double calcArea() {
        return (getLength() * getLength() / 2);
    }

    default double getHypotenuse() {
        return Math.sqrt(2 * getLength() * getLength());
    }

}
