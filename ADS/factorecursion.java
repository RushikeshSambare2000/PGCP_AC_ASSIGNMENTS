public class factorecursion{
    static int facto_rec(int num){
        if(num==0 | num==1){
            return 1;
        }else{
            return num*(facto_rec(num-1));
        }
    }
    public static void main(String[] args) {
        facto_rec(10);
        System.out.println(facto_rec(10));
    }
}