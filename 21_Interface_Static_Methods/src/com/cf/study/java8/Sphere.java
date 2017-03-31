package com.cf.study.java8;

public class Sphere implements Circle {

    private double length;

    public Sphere(final double length) {
        this.length = length;
    }

    public static void printType() {
        System.out.println(Sphere.class.getSimpleName());
    }

    @Override
    public double getLength() {
        return length;
    }

}
