import java.util.Scanner;
public class assignment1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter The time in format of 24 hour clock");
        int time=scanner.nextInt();
        if(time<=12 && time>=5){
          System.out.println("Good Morning");
        }   
    }
}
