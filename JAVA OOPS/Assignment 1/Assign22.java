import java.util.Scanner;

class Assign22{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any number:");
        int n=sc.nextInt();

        boolean isPrime=true;

        
        if(n<=1){
            isPrime=false;
        }
        else{
        for(int i=2;i<n;i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        }
        if(isPrime){
            System.out.println(n + " is prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
    }    
}
