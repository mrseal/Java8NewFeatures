package com.cf.study.java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class P02Merge {
    public static void main(final String[] args) {

        final Map<String, String> cMap = new HashMap<>();
        final String message = " (Verified C Country)";

        cMap.put("UK", "London");
        cMap.put("US", "Washington");
        cMap.put("IT", "Rome");
        cMap.put("CA", "Ottawa");
        cMap.put("CZ", "Prague");
        cMap.put("JP", "Tokyo");

        final List<String> cList = cMap.keySet().stream().filter(s -> s.startsWith("C")).collect(Collectors.toList());

        cList.forEach(e -> cMap.merge(e, message, (v, m) -> v.concat(m)));

        System.out.println("=== Map Contents ===");
        cMap.forEach((k, v) -> System.out.println("Key: " + k + "  Value: " + v));

    }
}
