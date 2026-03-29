import java.util.Scanner;

class Assign27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of English:");
        float eng=sc.nextFloat();

        System.out.println("Enter the marks of Maths:");
        float maths=sc.nextFloat();

        System.out.println("Enter the marks of Science:");
        float sci=sc.nextFloat();

        System.out.println("Enter the marks of Marathi:");
        float mar=sc.nextFloat();

        System.out.println("Enter the marks of History:");
        float his=sc.nextFloat();

        float total=eng+maths+sci+mar+his;
        System.out.println("Total Marks:" + total);

        float per=total/5;
        System.out.println("Percentage:" + per);

        if(per>80){
            System.out.println("Student get A grade");
        }
        else if(per>60){
            System.out.println("Student get B grade");
        }
        else if(per>40){
            System.out.println("Student get C grade");
        }
        else{
            System.out.println("Student is failed");
        }
    }
}
