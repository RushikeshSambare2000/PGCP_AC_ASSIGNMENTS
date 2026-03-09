import java.util.Scanner;
public class Assignment4_9_LargestEle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int largest;
        System.out.println("enter 5 numbers :");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        largest=arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
               largest=arr[i];
            }
        }
        System.out.println("the largest element in array is : "+largest);
    }
}
