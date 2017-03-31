package com.cf.study.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class P01RemoveIf {
    public static void main(final String[] args) {
        final ArrayList<SalesTxn> tList = (ArrayList) SalesTxn.createTxnList();
        final Consumer<SalesTxn> shortSummary = s -> System.out.println("ID: " + s.getTxnId() + " - " + "Buyer: " + s.getBuyerName() + " - "
                + "Prod: " + s.getProduct() + " - " + "ST: " + s.getState() + " - " + "Amt: " + s.getTransactionTotal());

        System.out.println("===Starting List===");
        tList.forEach(shortSummary);

        tList.removeIf(t -> "Radio Hut".equals(t.getBuyerName()));

        System.out.println("\n===Ending List===");
        tList.forEach(shortSummary);
    }
}
