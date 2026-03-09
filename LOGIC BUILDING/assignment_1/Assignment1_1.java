import java.util.Scanner;
class assignment1_1{
     public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num==0){
            System.out.println("given number is zero");
        }
        if(num < 0){
            System.out.println("the given number is Negative");
        };
        if(num>0){
            System.out.println("given number is positive");
        }
    }
}