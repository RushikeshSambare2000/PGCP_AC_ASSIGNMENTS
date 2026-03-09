import java.util.Scanner;

class leapyear{
    int year;

    void Isleap(int year){
      if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        System.out.println(year+" Year is leap year");
      }else{
        System.out.println(year +" is not leap year");
      }
    }
}
public class Assignment2_LeapYear {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     leapyear Leapyear=new leapyear();
     System.out.println("Enter Year : ");
    int year=sc.nextInt();
    Leapyear.Isleap(year);
        
    }
}
