package edu.wctc.salesreporting;


import edu.wctc.salesreporting.iface.SalesInput;
import edu.wctc.salesreporting.iface.SalesReport;
import edu.wctc.salesreporting.iface.ShippingPolicy;
import edu.wctc.salesreporting.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("edu.wctc.salesreporting")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new FileInput();
//        return new ConsoleInput();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return new OverXShipping();
//        return new FreeShipping();
//        return new FlatRateShipping();
    }

    @Bean SalesReport salesReport() {
        return new DetailReport();
//       return new SummaryReport();
    }
}