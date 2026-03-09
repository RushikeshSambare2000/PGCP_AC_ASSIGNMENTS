import java.util.Scanner;
public class Assignment_sumofNnumber {

    static void calculateSum(int num){
        int sum=0;
        for(int i=1; i<=num; i++){
            sum=sum+i;
        }
        System.out.println("the num of num 1 to "+ num + " is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int number=sc.nextInt();
        calculateSum(number);
    }
}
