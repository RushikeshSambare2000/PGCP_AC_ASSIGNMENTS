public class febonacci {
    static void fibo(int num) {
        int fnum = 0;
        int snum = 1;
        for (int i = 0; i <num; i++) {
            System.out.println(fnum);
            int fibonacci = snum+fnum;
            fnum = snum;
            snum = fibonacci;
            // System.out.println(fibonacci);
        }
         
       
    }

    public static void main(String[] args) {
        fibo(10);
        
    }
}
