import java.util.Scanner;
class Assign5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);

        char ch1=(char)(ch+1);
        System.out.println("Next Character:" + ch1);

        char ch2=(char)(ch-1);
        System.out.println("Previous Character:" + ch2);
    }
}
