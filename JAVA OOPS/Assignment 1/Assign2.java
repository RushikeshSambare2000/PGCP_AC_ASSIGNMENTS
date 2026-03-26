import java.util.Scanner;
class Assign2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1:");
        int num1=sc.nextInt();

        System.out.println("Enter the num2:");
        double num2=sc.nextDouble();

        double add=num1+num2;
        System.out.println("Addition:" + add);

        double div=num1/num2;
        System.out.println("Division:" + div);

        int add1=(int)add;
        System.out.println("Addition after type casting:" +add1);

        int div1=(int)div;
        System.out.println("Division after type casting:" + div1);

    }
}
