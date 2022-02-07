package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) { sale.setShipping(sale.getAmount() * .1); }
}
