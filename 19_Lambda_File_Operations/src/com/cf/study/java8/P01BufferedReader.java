package com.cf.study.java8;

import java.io.*;

public class P01BufferedReader {

    public static void main(final String[] args) {

        try {
            final BufferedReader bReader = new BufferedReader(new FileReader("hamlet.txt"));

            System.out.println("=== Entire File ===");
            bReader.lines().forEach(line -> System.out.println(line));

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
