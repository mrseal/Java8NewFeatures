package com.cf.study.java8;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class P03DirFind {

    public static void main(final String[] args) {

        try (Stream<Path> files = Files.find(Paths.get("."), 9, (p, a) -> a.isDirectory())) {

            System.out.println("\n=== Find all dirs ===");
            files.forEach(line -> System.out.println(line));

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
