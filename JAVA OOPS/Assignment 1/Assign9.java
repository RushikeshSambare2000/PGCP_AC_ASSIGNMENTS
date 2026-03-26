import java.util.Scanner;

class Assign9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value 1:");
        int a=sc.nextInt();
        
        System.out.println("Enter value 2:");
        int b=sc.nextInt();
        
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();

        switch(choice){
    

            case 1:
                int add=a+b;
                System.out.println(add);
                break;
            
            case 2:
                int sub=a-b;
                System.out.println(sub);
                break;
            
            case 3:
                int mul=a*b;
                System.out.println(mul);
                break;

            case 4:
                int div=a/b;
                System.out.println(div);
                break;

            default:
                System.out.println("Invalid choice");
                break;

        }
    }
}
