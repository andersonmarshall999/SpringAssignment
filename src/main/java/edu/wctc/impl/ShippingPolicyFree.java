package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.IShippingPolicy;

public class ShippingPolicyFree implements IShippingPolicy {
    public ShippingPolicyFree() {
        System.out.println("Free Shipping Policy");
    }
    @Override
    public double applyShipping(Sale sale) {
        return 0;
    }
}
