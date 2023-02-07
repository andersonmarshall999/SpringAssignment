package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.IShippingPolicy;

public class ShippingPolicyFRD implements IShippingPolicy {
    public ShippingPolicyFRD() {
        System.out.println("Flat-Rate Domestic Shipping Policy");
    }
    @Override
    public double applyShipping(Sale sale) {
        return sale.getAmount() * 0.1;
    }
}
