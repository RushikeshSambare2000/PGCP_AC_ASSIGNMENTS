import java.util.Scanner;

class Assign15 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int count=0;

    System.out.println("Enter a number:");
    int n=sc.nextInt();

    //int reversed=0;
    if(n==0){
        count=1;
    }else{
    while(n>0){
        n/=10;
        count++;

    }
}
    System.out.println("Total digits in Number:" + count);
}
}
