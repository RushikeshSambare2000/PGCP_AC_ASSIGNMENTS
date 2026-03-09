import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class Assignment4_13_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer[] arr=new Integer[5];
        System.out.println("Enter 5 integer in Array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        List<Integer> list = Arrays.asList(arr);
        int Search=sc.nextInt();
        if(list.contains(Search)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
