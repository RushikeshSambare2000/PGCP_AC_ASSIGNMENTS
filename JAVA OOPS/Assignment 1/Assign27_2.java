import java.util.Scanner;
public class Assign27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sub[]=new double[5];

        System.out.println("Enter the marks of 5 subjects:");
        for(int i=0;i<sub.length;i++){
           sub[i]=sc.nextDouble();
        }

        double total=0;
        for(int i=0;i<sub.length;i++){
            total+=sub[i];
        }

        System.out.println("Total Marks:" + total);

        double percent=total/sub.length;

        System.out.println("Percentage:" + percent);

        if(percent>80 && percent<=100){
            System.out.println("Student get A grade");
        }
        else if(percent>60){
            System.out.println("Student get B grade");
        }
        else if(percent>40){
            System.out.println("Student get C grade");
        }
        else{
            System.out.println("Student is failed");
        }

    }
}
