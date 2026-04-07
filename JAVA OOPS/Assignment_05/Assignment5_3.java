import java.util.*;

class FinancialCalculator {

    // Bounded Generic Method
    public static <T extends Number> void calculate(List<T> data) {
        double sum = 0.0;

        for (T value : data) {
            sum += value.doubleValue(); // convert to double
        }

        double average = sum / data.size();

        System.out.println("Data: " + data);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("------------------------");
    }
}

public class Assignment5_3 {
    public static void main(String[] args) {

        // Integer Transactions
        List<Integer> transactions = Arrays.asList(100, 200, 300, 400);
        FinancialCalculator.calculate(transactions);

        // Double Salaries
        List<Double> salaries = Arrays.asList(25000.5, 30000.75, 40000.25);
        FinancialCalculator.calculate(salaries);
    }
}

