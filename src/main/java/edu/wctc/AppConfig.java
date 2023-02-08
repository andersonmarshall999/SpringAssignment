package edu.wctc;

import edu.wctc.iface.*;
import edu.wctc.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public ISalesInput salesInput() {
        //return new SaleGetFromConsole();
        return new SaleGetFromFile();
    }

    //@Bean
    //public ISalesReport salesReport() {
    //    return new SalesReportDetail();
    //    //return new SalesReportSummary();
    //}

    @Bean
    public IShippingPolicy shippingPolicy() {
        //return new ShippingPolicyFRD();
        return new ShippingPolicyFree();
    }
}
