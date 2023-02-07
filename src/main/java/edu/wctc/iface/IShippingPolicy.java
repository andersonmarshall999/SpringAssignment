package edu.wctc.iface;

import edu.wctc.Sale;

public interface IShippingPolicy {
    double applyShipping(Sale sale);
}