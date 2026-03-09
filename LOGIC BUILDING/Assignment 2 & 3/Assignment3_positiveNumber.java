import java.util.Scanner;

class PositiveNumber {
    int num1;
    Scanner sc = new Scanner(System.in);

    void askForPositiveNumber() {

        do {
            System.out.println("enter the positive number");
            num1 = sc.nextInt();
            if (num1 > 0) {
                System.out.println("you entered the positive number :" + num1);
                break;
            }
        } while (num1<=0);
    }
}

public class Assignment3_positiveNumber {
    public static void main(String[] args) {
        PositiveNumber p = new PositiveNumber();
        p.askForPositiveNumber();
    }
}
