import java.util.*;

class ReportGenerator {

    // Generic Method
    public static <T> void generateReport(List<T> data) {
        System.out.println("----- Report -----");

        for (T item : data) {
            System.out.println(item);
        }

        System.out.println("------------------\n");
    }
}

public class Assignment5_2 {
   
 public static void main(String[] args) {

        // Sales Data (Double)
        List<Double> sales = Arrays.asList(1000.5, 2500.75, 3200.0);
        ReportGenerator.generateReport(sales);

        // Employee Names (String)
        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie");
        ReportGenerator.generateReport(employees);

        // Product IDs (Integer)
        List<Integer> productIds = Arrays.asList(101, 102, 103);
        ReportGenerator.generateReport(productIds);
    }
}
