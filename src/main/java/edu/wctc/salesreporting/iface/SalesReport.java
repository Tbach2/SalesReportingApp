package edu.wctc.salesreporting.iface;

import edu.wctc.salesreporting.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
