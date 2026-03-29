import java.util.Scanner;
public class Assign25_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1=sc.nextInt();

        System.out.println("Enter num2:");
        int num2=sc.nextInt();

        System.out.println("Before Swapping:" + num1);
        System.out.println("Before Swapping:" + num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping:" + num1);
        System.out.println("After Swapping:" + num2);
    }
    
}