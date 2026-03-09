import java.util.Scanner;
public class assignment1_4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter lenth side of square");
        int side_length=scanner.nextInt();
        int area=side_length*side_length;
        System.out.println("The area of Square is "+area);

    }
}
