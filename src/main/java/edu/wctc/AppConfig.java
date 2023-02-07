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
        return null;
    }

    @Bean
    public ISalesReport salesReport() {
        return null;
    }

    @Bean
    public IShippingPolicy shippingPolicy() {
        return new ShippingPolicyFree();
        //return new ShippingPolicyFRD();
    }
}
