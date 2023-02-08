package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleGetFromFile implements ISalesInput {
    public SaleGetFromFile() {
        System.out.println("Get Sales from File");
    }

    @Override
    public List<Sale> getSales() {
        try {
            Scanner scanner = new Scanner(new File("sales.txt"));
            List<Sale> sales = new ArrayList<>();
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split(",");
                String customer = details[0];
                String country = details[1];
                double amount = Double.parseDouble(details[2]);
                double tax = Double.parseDouble(details[3]);
                Sale s = new Sale(customer, country, amount, tax, 0);
                sales.add(s);
            }
            return sales;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
