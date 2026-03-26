import java.util.Scanner;

class Assign16 {
    public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);

    int reversed=0;

    System.out.println("Enter a number:");
    int n=sc.nextInt();

    int original=n;

    while(n!=0){
        int digit=n%10;

        reversed=reversed*10+digit;

        n/=10;

    }
    if(original==reversed){
        System.out.println("Number is palindrome");
    }
    else{
        System.out.println("Number is not palindrome");
    }
    
}
}

