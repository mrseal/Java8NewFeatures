package com.cf.study.java8;

import java.util.List;

public class PerformanceTestParallel {

    public static void main(final String[] args) {

        final List<SalesTxn> pList = SalesTxn.createTxnList();
        for (int i = 0; i < 10000000; i++) {
            pList.add(new SalesTxn.Builder().buyerName("Buyer " + i).build());
        }

        final long pStart = System.currentTimeMillis();
        final double p = pList.parallelStream().filter(t -> "Radio Hut".equals(t.getBuyerName())).mapToDouble(t -> t.getTransactionTotal())
                .reduce(0, (sum, e) -> sum + e);
        final long pCost = System.currentTimeMillis() - pStart;

        System.out.println("=== Transactions Totals ===");
        System.out.printf("[Parallel " + pCost + "ms] Radio Hut Total: $%,9.2f%n", p);

    }
}
