public class Assignment4_17_pattern {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1; i<=5;i++){
            int num=1;
            for(int j=1;j<=i; j++){
                   System.out.print(num);
                if(j<i){
                    System.out.print("*");
                }
                num+=2;
            }
            System.out.println();
        }
    }
}
