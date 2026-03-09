import java.util.Scanner;
public class Assignment4_11_PositiveNegatie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        int positive=0;
        int negative=0;
        System.out.println("enter 4 integer in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
              positive++;
            }else{
                negative++;
            }
        }
        System.out.println("The count if positive number is : "+positive+" \n The count of Negative Number is : "+negative);
    }
}
