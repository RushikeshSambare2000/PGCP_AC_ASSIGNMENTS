import java.util.Scanner;

class Assign10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any character:");
        char ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Given character is vowel");
        }else{
            System.out.println("Given character is consonent");
        }
    }
}
