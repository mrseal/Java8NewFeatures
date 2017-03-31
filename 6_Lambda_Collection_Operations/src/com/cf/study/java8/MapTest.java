package com.cf.study.java8;

import java.util.List;

public class MapTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();

        // Calculate sales tax for CA Transactions
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
            .filter(t -> State.CA.equals(t.getState()))
            .filter(t -> "Widget Pro".equals(t.getProduct()))
            .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
            .forEach(amt -> System.out.printf("Txn tax: $%,9.2f%n", amt));

    }
}
