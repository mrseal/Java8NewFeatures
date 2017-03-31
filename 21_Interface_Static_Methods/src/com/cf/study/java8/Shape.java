package com.cf.study.java8;

public interface Shape {

    static void printType() {
        System.out.println(Shape.class.getSimpleName());
    }

    default double calcArea() {
        return 0;
    }

    static double compareArea(final double target, final Shape s) {
        return Math.abs(target - s.calcArea());
    }

    abstract double getLength();

}
