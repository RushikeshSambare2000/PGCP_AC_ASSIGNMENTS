import java.util.Scanner;
public class Assignment4_24_ReverseString {
    public static void main(String[] args) {
   String Original_string="Hello";
        String Reversed_String="";
        for(int i=Original_string.length()-1; i>=0 ;i--){
            Reversed_String=Reversed_String+Original_string.charAt(i);
        }
        System.out.println(Reversed_String);

    
    }
}




