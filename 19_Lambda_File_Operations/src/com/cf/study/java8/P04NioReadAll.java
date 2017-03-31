package com.cf.study.java8;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;

public class P04NioReadAll {
    public static void main(final String[] args) {

        final Path file = Paths.get("hamlet.txt");
        final List<String> fileArr;
        try {
            fileArr = Files.readAllLines(file);

            System.out.println("\n=== Lord Count ===");
            long wordCount = fileArr.stream().flatMap(line -> Stream.of(line.split(" "))).filter(word -> word.contains("lord"))
                    .peek(word -> System.out.println(word)).count();

            System.out.println("Word count: " + wordCount);

            System.out.println("\n=== Prison Count ===");
            wordCount = fileArr.stream().flatMap(line -> Stream.of(line.split(" "))).filter(word -> word.contains("prison"))
                    .peek(word -> System.out.println(word)).count();

            System.out.println("Word count: " + wordCount);

        } catch (final IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
