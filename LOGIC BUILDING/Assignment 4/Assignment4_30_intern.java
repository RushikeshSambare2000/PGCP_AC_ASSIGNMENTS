public class Assignment4_30_intern {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = str1.intern();
        String str3 = "hello";

        if(str2==str3){
            System.out.println("str2 and str 3 are pointing to the same object");
        }else{
            System.out.println(false);
        }
    }
}
