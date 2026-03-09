import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Assignment4_12_sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter 5 integer in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
          for(int i=0; i<arr.length; i++){
            System.out.println("The elements of arr after sorting : "+arr[i]);
        }
        
    }
}

