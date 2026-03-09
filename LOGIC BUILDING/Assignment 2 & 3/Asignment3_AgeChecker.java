import java.util.Scanner;

class age_check{
    int age;

    age_check(int Age){
        age=Age;
    }

    void checkAgeCategory(int age){
        if(age<18){
            System.out.println("you ara an minor");
        }
        else if(age>=18 && age<60){
            System.out.println("you are an adult");
        }else{
            System.out.println("you are citizen");
        }
    }
}
public class Asignment3_AgeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        age_check a=new age_check(age);
        a.checkAgeCategory(age);
    }
}
