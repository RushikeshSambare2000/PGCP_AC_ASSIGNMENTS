import java.util.Scanner;
public class Assignment4_8_stringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] Name=new String[4];
        System.out.println("Enter 4 names in array :");
        for(int i=0; i<Name.length; i++){
          Name[i]=sc.nextLine();
        }
         for(int i=0; i<Name.length; i++){
          System.out.println(Name[i]);
        }
    }
}
