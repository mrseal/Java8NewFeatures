package com.cf.study.java8;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author oracle
 */
public class LazyTest {

    public static void main(final String[] args) {

        final List<SalesTxn> tList = SalesTxn.createTxnList();

        final Predicate<SalesTxn> widgetProSales = t -> "Widget Pro".equals(t.getProduct());
        final Predicate<SalesTxn> ColoradoTxns = t -> State.CO.equals(t.getState());

        final Consumer<SalesTxn> quantReport = t -> System.out.printf("Seller: " + t.getSalesPerson() + "-- Buyer: " + t.getBuyerName()
                + " -- Quantity: %,9.0f%n", t.getUnitCount());
        final Consumer<SalesTxn> streamStart = t -> System.out.println("Stream start: " + t.getSalesPerson() + " ID: " + t.getTxnId());
        final Consumer<SalesTxn> stateSearch = t -> System.out.println("State Search: " + t.getSalesPerson() + " St: " + t.getState());
        final Consumer<SalesTxn> productSearch = t -> System.out.println("Product Search");

        // Print out list normally
        System.out.println("=== Widget Pro Quantity in CO ===");
        tList.stream().filter(widgetProSales).filter(ColoradoTxns).forEach(quantReport);

        // Print out all the steps in the list
        System.out.println("\n=== Widget Pro Quantity in CO ===");
        tList.stream().peek(streamStart).filter(widgetProSales).peek(productSearch).filter(ColoradoTxns).peek(stateSearch).forEach(quantReport);

        // Update code to handle return value of a findFirst
        System.out.println("\n=== Widget Pro Quantity in CO (FindFirst)===");
        final Optional<SalesTxn> ft = tList.stream().peek(streamStart).filter(widgetProSales).peek(productSearch).filter(ColoradoTxns)
                .peek(stateSearch).findFirst();

        if (ft.isPresent()) {
            quantReport.accept(ft.get());
            ;
        }

    }
}
