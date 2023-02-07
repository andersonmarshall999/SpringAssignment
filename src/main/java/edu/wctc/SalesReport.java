package edu.wctc;

import edu.wctc.iface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalesReport {
    private ISalesInput input;
    private ISalesReport report;
    private IShippingPolicy shippingPolicy;

    @Autowired
    public SalesReport(ISalesInput input, ISalesReport report, IShippingPolicy shippingPolicy) {
        this.input = input;
        this.report = report;
        this.shippingPolicy = shippingPolicy;
        System.out.println("SalesReport created with policy " + shippingPolicy.toString());
    }

    public void generateReport() {
        //List<Sale> allSales = input.getSales();
        //for(Sale aSale : allSales)
        //    shippingPolicy.applyShipping(aSale);
        //report.generateReport(allSales);
    }
}
