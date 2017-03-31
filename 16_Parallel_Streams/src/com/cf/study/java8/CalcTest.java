package com.cf.study.java8;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CalcTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");

        final Stream<SalesTxn> s1 = tList.stream();
        final Stream<SalesTxn> s2 = s1.filter(t -> "Radio Hut".equals(t.getBuyerName()));
        final DoubleStream s3 = s2.mapToDouble(t -> t.getTransactionTotal());

        final double t1 = s3.sum();

        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);

    }
}
