public class Assignment4_31_Literals {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";
        if(str1==str3 && str3==str2){
            System.out.println("all three strings are pointing to same object");
        }
    }
}
