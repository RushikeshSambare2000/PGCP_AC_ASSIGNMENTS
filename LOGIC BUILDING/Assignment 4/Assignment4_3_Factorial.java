import java.util.Scanner;

class Factorial {
    int facto = 1;

    int Calculate_factorial(int num) {
        for (int i = 1; i <= num; i++) {
            facto = facto * i;
        }
        return facto;
    }

}

public class Assignment4_3_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Factorial f1 = new Factorial();
        int result = f1.Calculate_factorial(num);
        System.out.println(result);
    }
}
