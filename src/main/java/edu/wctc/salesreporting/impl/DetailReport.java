package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.SalesReport;

import java.util.List;

public class DetailReport implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-25s %-20s %-10s %-10s %-10s\n",
                "Customer",
                "Country",
                "Amount",
                "Tax",
                "Shipping"
        );
        for (Sale sale : salesList) {
            System.out.printf("%-25s %-20s %-10s %-10s %-10s\n",
                    sale.getCustomer(),
                    sale.getCountry(),
                    String.format("%.2f", sale.getAmount()),
                    String.format("%.2f", sale.getTax()),
                    String.format("%.2f", sale.getShipping())
            );
        }
    }
}
