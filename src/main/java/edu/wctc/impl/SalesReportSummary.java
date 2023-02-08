package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesReport;

import java.util.List;

public class SalesReportSummary implements ISalesReport {
    public SalesReportSummary() {
        System.out.println("Summary Sales Report");
    }

    @Override
    public void generateReport(List<Sale> allSales) {
        System.out.println("yea baby");
    }
}
