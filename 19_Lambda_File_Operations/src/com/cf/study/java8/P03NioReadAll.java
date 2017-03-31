package com.cf.study.java8;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 *
 * @author oracle
 */
public class P03NioReadAll {

    public static void main(final String[] args) {

        final List<String> fileArr;
        final Path file = Paths.get("hamlet.txt");
        try {
            fileArr = Files.readAllLines(file);
            System.out.println("\n=== Rosencrantz ===");
            fileArr.stream().filter(line -> line.contains("Ros.")).forEach(line -> System.out.println(line));

            System.out.println("\n=== Guildenstern ===");
            fileArr.stream().filter(line -> line.contains("Guil.")).forEach(line -> System.out.println(line));

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
