public class ReverseString{

    static String ReverseStr(String name){
        if(name.length()==0 || name.length()==1){
            return name;
        }
        return ReverseStr(name.substring(1))+name.charAt(0);
    }
    public static void main(String[] args) {
        String name= "Rushikesh Sambare";
        String  res = ReverseStr(name); 
        System.out.println(res);
    }
}


