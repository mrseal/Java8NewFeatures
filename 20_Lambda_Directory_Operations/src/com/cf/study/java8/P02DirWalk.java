package com.cf.study.java8;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class P02DirWalk {
    public static void main(final String[] args) {
        try (Stream<Path> files = Files.walk(Paths.get("."))) {

            System.out.println("\n=== Dir walk ===");
            files.forEach(file -> System.out.println(file));

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (Stream<Path> files = Files.walk(Paths.get("."))) {

            System.out.println("\n=== src build ===");
            files.filter(path -> path.toString().contains("src")).forEach(line -> System.out.println(line));

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
