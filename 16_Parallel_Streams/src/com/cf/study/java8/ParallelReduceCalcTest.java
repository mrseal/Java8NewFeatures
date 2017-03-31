package com.cf.study.java8;

import java.util.List;

public class ParallelReduceCalcTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");

        final double t2 = tList.parallelStream().filter(t -> "PriceCo".equals(t.getBuyerName())).mapToDouble(t -> t.getTransactionTotal())
                .reduce(0, (sum, e) -> sum + e);

        System.out.printf("%nPriceCo Total: $%,9.2f%n", t2);

        final int c2 = tList.parallelStream().filter(t -> "PriceCo".equals(t.getBuyerName())).mapToInt(t -> 1).reduce(0, (sum, e) -> sum + e);

        System.out.printf("PriceCo Transactions: %,6d%n", c2);

    }
}
