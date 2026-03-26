import java.util.*;;
class ATM {
    double balance;
   
    ATM(double balance) {
        this.balance = balance;
    }

    void SetBalanace(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        } else {
            System.out.println("Invalid amount please enter amount greater than zero");
        }
    }

    public void getBalance() {
        System.out.println("current balanace is :"+balance);
    }

    void depositeMoney(double deposite_amount){
         if(deposite_amount>0){
            this.balance=this.balance+deposite_amount;
         }else{
            System.out.println("invalid amount");
         }
    }


    void withdrawMoney(double Withdraw_amount){
         if(Withdraw_amount>0){
            this.balance=this.balance-Withdraw_amount;
         }else{
            System.out.println("insufficient balance");
         }
    }

}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      boolean flag=true;
      ATM sbi = new ATM(0);
      
      while (flag) {
        System.out.println("Please choose correct option \n 1. deposite money \n 2. check balance \n 3 . withdraw money \n 4. exit");
        int UserInput=sc.nextInt();
        switch (UserInput) {
            case 1:
                System.out.println("Enter amount to deposit : ");
                double D_amount=sc.nextDouble();
                sbi.depositeMoney(D_amount);
                break;
            case 2 :
                sbi.getBalance();
                break;
            case 3 :
                System.out.println("enter anounnt for withdraww :");
                double W_amount=sc.nextDouble();
                sbi.withdrawMoney(W_amount);   
                break;
            case 4 : 
            System.out.println("thanks to visit SBI");  
            flag=false;  
            default:
                break;
        }
      }

    }
}
