import java.util.Scanner;
public class Assignment4_10_ArrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[] arr=new int[5];
        System.out.println("enter 5 integer in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        int avg=sum/arr.length;
        System.out.println("The avg of all elements of arr is : "+avg);
    }
}
