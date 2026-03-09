public class Assignment4_16_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
                if(j<i){
                  System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
