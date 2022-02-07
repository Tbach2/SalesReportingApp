package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        File file = new File("sales.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] contents = line.split(",");
                Sale sale = new Sale();
                sale.setCustomer(contents[0]);
                sale.setCountry(contents[1]);
                sale.setAmount(Float.parseFloat(contents[2]));
                sale.setTax(Float.parseFloat(contents[3]));
                sales.add(sale);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sales;
    }
}
