import java.util.Scanner;

class Assign18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int a=0,b=1;

        for(int i=1;i<=n;i++){
            System.out.println(a + " ");

            int next=a+b;
            a=b;
            b=next;
        }
        
    }
}
