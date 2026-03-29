import java.util.Scanner;
public class Assign23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the numbers");
        int n=sc.nextInt();

        int sumOfEven=0;
        int sumOfOdd=0;

        for(int i=0;i<=n;i++){
        if(i%2==0){
            sumOfEven+=i;

        }else{
            sumOfOdd+=i;
        }
    }
        System.out.println("Sum of even numbers is " + sumOfEven);
        System.out.println("Sum of even numbers is " + sumOfOdd);


        





        
    
    
}
}
