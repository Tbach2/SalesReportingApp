package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String keyIn = "y";

        while (keyIn.equalsIgnoreCase("y")) {
            Sale sale = new Sale();

            System.out.println("Enter Customer: ");
            sale.setCustomer(keyboard.nextLine());
            System.out.println("Enter Country: ");
            sale.setCountry(keyboard.nextLine());
            System.out.println("Enter Amount: ");
            sale.setAmount(Float.parseFloat(keyboard.nextLine()));
            System.out.println("Enter Tax: ");
            sale.setTax(Float.parseFloat(keyboard.nextLine()));

            sales.add(sale);
            System.out.println("Add More? ");
            keyIn = keyboard.nextLine();
        }

        return sales;
    }
}
