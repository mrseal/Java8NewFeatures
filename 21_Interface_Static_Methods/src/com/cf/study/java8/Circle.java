package com.cf.study.java8;

public interface Circle extends Shape {

    static void printType() {
        System.out.println(Circle.class.getSimpleName());
    }

    @Override
    default double calcArea() {
        return (Math.PI * getLength() * getLength());
    }

}
