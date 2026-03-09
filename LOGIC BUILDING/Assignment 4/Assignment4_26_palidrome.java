import java.util.Scanner;

public class Assignment4_26_palidrome {
       public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String Str=sc.nextLine();
        Str=Str.toLowerCase();
        String Reversed_str="";
        for(int i=Str.length()-1;i>=0;i--){
            Reversed_str=Reversed_str+Str.charAt(i);
        }
  if(Str.equals(Reversed_str)){
    System.out.println("Given string is palindrome");
  }else{
    System.out.println("Given String is not palindrome");
  }
    }
}