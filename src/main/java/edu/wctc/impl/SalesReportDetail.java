package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesReport;

import java.util.List;

public class SalesReportDetail implements ISalesReport {
    public SalesReportDetail() {
        System.out.println("Detail Sales Report");
    }

    @Override
    public void generateReport(List<Sale> allSales) {
        System.out.println("woo yeah");
    }
}
