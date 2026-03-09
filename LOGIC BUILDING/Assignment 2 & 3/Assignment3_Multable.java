import java.util.Scanner;


public class Assignment3_Multable {

    static void  printMultiplicationTable(int num){
        for(int i=1; i<=10; i++){
            int mul=i*num;
            System.out.println(i+" x "+num+" = "+mul);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which mul table you want : ");
        int num=sc.nextInt();
        printMultiplicationTable(num);
    }
}
