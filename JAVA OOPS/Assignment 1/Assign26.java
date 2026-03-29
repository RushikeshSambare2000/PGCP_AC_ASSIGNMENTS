import java.util.Scanner;

public class Assign26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=sc.nextInt();

        int sum=0;

        while(num>0){
        int rem=num%10;

        int digit=rem*rem;

        sum=sum+digit;
        }
        if(sum==num){
            System.out.println("Entered number is armstrong");
        }
        else{
            System.out.println("Entered number is not armstrong");
        }
    }
}
