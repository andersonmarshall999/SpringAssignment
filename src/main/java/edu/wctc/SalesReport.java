package edu.wctc;

import edu.wctc.iface.ISalesInput;
import edu.wctc.iface.ISalesReport;
import edu.wctc.iface.IShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReport {
    private ISalesInput input;
    //private ISalesReport report;
    private IShippingPolicy shippingPolicy;

    @Autowired
    public SalesReport(ISalesInput input, IShippingPolicy shippingPolicy) {
        this.input = input;
        //this.report = report;
        this.shippingPolicy = shippingPolicy;
        System.out.println("SalesReport created");
    }

    public void start() {
        System.out.println("Starting...");
        List<Sale> preshipSales = getSales();
        System.out.println(preshipSales);
        //generateReport(preshipSales);
    }

    public List<Sale> getSales() {
        return input.getSales();
    }

    public void generateReport(List<Sale> salesList) {
        //List<Sale> allSales = input.getSales();
        //for(Sale aSale : allSales)
        //    shippingPolicy.applyShipping(aSale);
        //report.generateReport(allSales);
    }
}
