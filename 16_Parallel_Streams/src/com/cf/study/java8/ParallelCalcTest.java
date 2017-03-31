package com.cf.study.java8;

import java.util.List;

/**
 *
 * @author oracle
 */
public class ParallelCalcTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        final double t1 = tList.parallelStream().filter(t -> "Radio Hut".equals(t.getBuyerName())).mapToDouble(t -> t.getTransactionTotal()).sum();

        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);

        final double t2 = tList.parallelStream().filter(t -> "PriceCo".equals(t.getBuyerName())).mapToDouble(t -> t.getTransactionTotal()).sum();

        System.out.printf("PriceCo Total: $%,9.2f%n", t2);

        final double t3 = tList.parallelStream().filter(t -> "Best Deals".equals(t.getBuyerName())).mapToDouble(t -> t.getTransactionTotal()).sum();

        System.out.printf("Best Deals Total: $%,9.2f%n", t3);

    }
}
