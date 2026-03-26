import java.util.Scanner;

class Assign14 {
    public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);

    int reversed=0;

    System.out.println("Enter a number:");
    int n=sc.nextInt();

    //int reversed=0;

    while(n!=0){
        int digit=n%10;

        reversed=reversed*10+digit;

        n/=10;

    }
    System.out.println("Reversed Number:" + reversed);
}
}
