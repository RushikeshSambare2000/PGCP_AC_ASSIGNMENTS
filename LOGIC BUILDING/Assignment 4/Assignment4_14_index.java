import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Assignment4_14_index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.println("enter 5 integer in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
       System.out.println("Enter the number to search :");
       Integer search=sc.nextInt();
       Integer index=Arrays.binarySearch(arr,search);
       if(index>=0){
        System.out.println("The nuumber "+search+" found at index "+index);
       }

    }
}
