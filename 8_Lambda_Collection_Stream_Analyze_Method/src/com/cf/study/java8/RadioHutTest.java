package com.cf.study.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author oracle
 */
public class RadioHutTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();
        final Consumer<SalesTxn> radioReport = t -> System.out.printf(
                "ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() + "-- Buyer: " + t.getBuyerName() + " -- State: " + t.getState()
                + " -- Amt: $%,9.0f%n", t.getTransactionTotal());

        final Predicate<SalesTxn> radioHutTxns = t -> "Radio Hut".equals(t.getBuyerName());

        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        tList.stream().filter(radioHutTxns).forEach(radioReport);

        // Print out the total number of transactions
        System.out.print("Total Transactions: ");
        System.out.println(tList.stream().filter(radioHutTxns).count());

        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");
        final Optional<SalesTxn> max = tList.stream().filter(radioHutTxns).max(Comparator.comparing(SalesTxn::getTransactionTotal));
        if (max.isPresent()) {
            radioReport.accept(max.get());
        }

        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");
        System.out.println("=== Radio Hut Largest ===");
        final Optional<SalesTxn> min = tList.stream().filter(radioHutTxns).min(Comparator.comparing(SalesTxn::getTransactionTotal));
        if (min.isPresent()) {
            radioReport.accept(min.get());
        }

    }
}
