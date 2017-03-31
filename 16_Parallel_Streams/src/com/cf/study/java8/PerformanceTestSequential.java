package com.cf.study.java8;

import java.util.List;

public class PerformanceTestSequential {

    public static void main(final String[] args) {

        final List<SalesTxn> sList = SalesTxn.createTxnList();
        for (int i = 0; i < 10000000; i++) {
            sList.add(new SalesTxn.Builder().buyerName("Buyer " + i).build());
        }

        final long sStart = System.currentTimeMillis();
        final double s = sList.stream().filter(t -> "Radio Hut".equals(t.getBuyerName())).mapToDouble(t -> t.getTransactionTotal()).sum();
        final long sCost = System.currentTimeMillis() - sStart;

        System.out.println("=== Transactions Totals ===");
        System.out.printf("[Sequential " + sCost + "ms] Radio Hut Total: $%,9.2f%n", s);

    }
}
