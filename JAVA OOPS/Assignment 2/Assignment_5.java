import java.util.Scanner;

class employee{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    double basic;

    employee(String name, int id, double basic){
      this.name=name;
      this.id=id;
      this.basic=basic;
    }
       void EnterEmpDetails(){
 // Input
        System.out.print("Enter Employee Name: ");
        this.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        this.id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        this.basic = sc.nextDouble();

       }  
       void CalSalary(){
        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double pf = 0.08 * basic;

        double netSalary = basic + hra + da - pf;

        System.out.println("\n===== SALARY SLIP =====");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("----------------------------");
        System.out.println("Basic Salary  : " + this.basic);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("PF (8%)       : " + pf);
        System.out.println("----------------------------");
        System.out.println("Net Salary    : " + netSalary);
        System.out.println("============================");
       }
}

class Assignment_5 {
    public static void main(String[] args) {
        employee e1=new employee(null, 0, 0);
        e1.EnterEmpDetails();
        e1.CalSalary();
    }
}