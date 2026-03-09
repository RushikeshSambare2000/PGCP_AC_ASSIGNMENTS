public class Assignment4_29_contacat {
    public static void main(String[] args) {
        String str1="rushi";
        String str2="sambare";
        String str3=str1+str2;

        if(str3==str1){
            System.out.println("both str1 and str3 pointing to the same object");
        }else{
            System.out.println("false");
        }
    }
}
