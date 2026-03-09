import java.util.Scanner;
public class Assignment4_1_PrintNum {
    public static void main(String[] args) {
          int num;
          Scanner sc=new Scanner(System.in);
         System.out.println("enter the number : ");
         num=sc.nextInt();
         for(int i=1; i<=num; i++){
            System.out.println(i);
         }
    }
  
}
