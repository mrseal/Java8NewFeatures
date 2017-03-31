package com.cf.study.java8;

public class Cone implements Circle, Triangle {

    private double length;

    public Cone(final double length) {
        this.length = length;
    }

    public static void printType() {
        System.out.println(Cone.class.getSimpleName());
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double calcArea() {
        return (Math.PI * getHypotenuse() + Circle.super.calcArea());
    }

}
