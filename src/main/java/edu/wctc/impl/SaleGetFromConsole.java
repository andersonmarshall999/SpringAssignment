package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleGetFromConsole implements ISalesInput {
    Scanner scanner = new Scanner(System.in);
    public SaleGetFromConsole() {
        System.out.println("Get Sales from Console");
    }

    @Override
    public List<Sale> getSales() {
        System.out.print("Paste all data here (it wont work): ");
        String salesData = scanner.nextLine();
        List<Sale> sales = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String[] details = salesData.split(",");
            String customer = details[0];
            String country = details[1];
            double amount = Double.parseDouble(details[2]);
            double tax = Double.parseDouble(details[3]);
            Sale s = new Sale(customer, country, amount, tax, 0);
            sales.add(s);
        }
        return sales;
    }
}
