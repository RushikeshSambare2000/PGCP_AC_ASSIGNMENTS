import java.util.Scanner;
public class Assign24 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        int largest=0;

        while(n>0){
            int rem=n%10;

            if(rem>largest){
                largest=rem;
            }

            n/=10;
        }

        System.out.println("Largest Digit is " + largest);
            
        
        



    }
    
}
