package com.cf.study.java8;

import java.util.List;
import java.util.function.Consumer;

public class PeekTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();
        final Consumer<SalesTxn> taxReport = t -> System.out.printf("Id: " + t.getTxnId() + " Buyer: " + t.getBuyerName() + " Txn amt: $%,9.2f ",
                t.getTransactionTotal());

        // Write report using peek
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
            .filter(t -> State.CA.equals(t.getState()))
            .filter(t -> "Widget Pro".equals(t.getProduct()))
            .peek(taxReport)
            .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
            .forEach(amt -> System.out.printf("Txn tax: $%,9.2f%n", amt));

    }
}
