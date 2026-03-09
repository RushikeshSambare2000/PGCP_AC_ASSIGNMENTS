import java.util.Scanner;

public class assignment1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter First number : ");
        int num_1 = scanner.nextInt();
        System.out.println("enter Second number : ");
        int num_2 = scanner.nextInt();
        System.out.println("enter Third number : ");
        int num_3 = scanner.nextInt();

        
        if (num_1 >= num_2 && num_1 >= num_3) {
            System.out.println("Greatest number is: " + num_1);
        } else if (num_2 >= num_1 && num_2 >= num_3) {
            System.out.println("Greatest number is: " + num_2);
        } else {
            System.out.println("Greatest number is: " + num_3);
        }

    }
}
