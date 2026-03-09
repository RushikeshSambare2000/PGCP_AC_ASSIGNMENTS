import java.util.Scanner;
class assignment1_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("the given number is even");
        }else{
            System.out.println("given nmber is odd");
        }
    }
}
