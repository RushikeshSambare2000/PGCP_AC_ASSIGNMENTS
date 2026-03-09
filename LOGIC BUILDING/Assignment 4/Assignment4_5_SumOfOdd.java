import java.util.Scanner;
public class Assignment4_5_SumOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the Number :");
        int num =sc.nextInt();
        for(int i=0; i<=num; i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("sum of odd num formb 1 to "+num+" is "+sum );

    }
}


