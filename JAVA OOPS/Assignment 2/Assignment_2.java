import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    String Name;
    int RollNo;
    float Mark_English;
    float Marks_Hindi;
    float Marks_Math;
    float Marks_History;
    float Marks_Science;
    float Avg, percentage, TotalMarks;

    void calculate_Result() {
        TotalMarks = Mark_English + Marks_Hindi + Marks_History + Marks_Math + Marks_Science;
        Avg = TotalMarks / 5;
        percentage = TotalMarks / 500 * 100;
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Avg marks : " + Avg);
        System.out.println("Total percentage :" + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

    }

    void GetData() {
        System.out.println("enter Name: ");
        this.Name = sc.nextLine();
          System.out.println("enter Rollno: ");
        this.RollNo = sc.nextInt();

        System.out.println("Enter Marks for English :");
        Mark_English = sc.nextFloat();
        System.out.println("Enter Marks for Math :");
        Marks_Math = sc.nextFloat();
        System.out.println("Enter Marks for Hindi :");
        Marks_Hindi = sc.nextFloat();
        System.out.println("Enter Marks for History :");
        Marks_History = sc.nextFloat();
        System.out.println("Enter Marks for Science :");
        Marks_Science = sc.nextFloat();
    }

}

// 90 and above → A
// 75 to 89 → B
// 60 to 74 → C
// 40 to 59 → D
// Below 40 → Fail
public class Assignment_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.GetData();
        s1.calculate_Result();
    }
}
