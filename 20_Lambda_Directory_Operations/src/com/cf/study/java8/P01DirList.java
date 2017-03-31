package com.cf.study.java8;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class P01DirList {
    public static void main(final String[] args) {

        try (Stream<Path> files = Files.list(Paths.get("."))) {

            System.out.println("\n=== Dir list ===");
            files.forEach(file -> System.out.println(file));

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
