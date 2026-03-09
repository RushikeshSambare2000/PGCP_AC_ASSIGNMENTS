import java.util.Scanner;

class SumOfnumber {
    int num1;
    int num2;

    int SumOfTwoNumber(int a, int b) {
        int sum;
        return sum = a + b;
    }
}

public class Assignment3_SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of num 1 : ");
        int num1 = sc.nextInt();
        System.out.println("enter the value of num 2 : ");
        int num2 = sc.nextInt();

        SumOfnumber sum1 = new SumOfnumber();
        int Final_sum = sum1.SumOfTwoNumber(num1, num2);
        System.out.println("The sum of two num is : " + Final_sum);
    }
}
