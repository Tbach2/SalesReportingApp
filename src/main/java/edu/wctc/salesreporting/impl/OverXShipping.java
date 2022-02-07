package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.ShippingPolicy;

public class OverXShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {

        double shipping;
        if (sale.getAmount() > 100) {
            sale.setShipping(0);
        }
        else {
            sale.setShipping(10);
        }
    }
}

