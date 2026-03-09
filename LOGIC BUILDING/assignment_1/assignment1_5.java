import java.util.Scanner;
public class assignment1_5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter Length and width side of Reactangle");
        int length=scanner.nextInt();
        int width=scanner.nextInt();
        int area=length*width;
        System.out.println("The area of Reactangle is "+area);

    }
}