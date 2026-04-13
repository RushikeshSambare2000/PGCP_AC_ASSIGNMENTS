public class fiborecursion {
    static int fibo_rec(int num){
        if(num<=1){
            return num;
        }else{
            return fibo_rec(num-1)+fibo_rec(num-2);
            
        }
    }
    public static void main(String[] args) {
        int res =fibo_rec(5);
        System.out.println(res);
    }
}
