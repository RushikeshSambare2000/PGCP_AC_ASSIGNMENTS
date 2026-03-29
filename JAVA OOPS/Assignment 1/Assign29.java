import java.util.Scanner;

public class Assign29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String choice;
        do{
        System.out.println("Enter value of a:");
        int a=sc.nextInt();

        System.out.println("Enter value of b:");
        int b=sc.nextInt();

        System.out.println("1.Add\n2.Subtract\n3.Exit\n");

        System.out.println("Enter your choice:");
        int userChoice=sc.nextInt();

        switch(userChoice){
            case 1:
                int add=a+b;
                System.out.println("Addition of two numbers is " + add);
                break;

            case 2:
                int sub=a-b;
                System.out.println("Subtraction of two numbers is " + sub);
                break;

            case 3:
                System.out.println("Exiting the program");
                break;

            default:
                System.out.println("Invalid Choice");
                break;

            
        }
         System.out.println("Do you want to continue YES/NO?");
         choice=sc.next();
    }while(choice.equalsIgnoreCase("YES"));
    }
}
