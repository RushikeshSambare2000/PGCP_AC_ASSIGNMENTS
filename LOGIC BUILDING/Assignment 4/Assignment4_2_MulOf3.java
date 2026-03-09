import java.util.Scanner;
public class Assignment4_2_MulOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
