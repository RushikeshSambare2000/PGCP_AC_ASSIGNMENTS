import java.util.Scanner;

public class Assign28 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age of a person:");
    int age=sc.nextInt();

    if(age>=18){
        System.out.println("Person is eligible for voting");
    }
    else{
        System.out.println("Person is not eligible for voting");
    }
}
}
