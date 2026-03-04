/*
This challenge tests your understanding of:

Class definition
Access specifiers
Encapsulation
Getter and Setter methods
Object creation
Create a class named BankAccount with:

Private Data Members:
int accountNumber
double balance
Public Member Functions:

void setAccount(int accNo, double bal)
void deposit(double amount)
void withdraw(double amount)
double getBalance()
Rules:

Initial balance cannot be negative. If negative, set balance to 0.
Withdrawal is allowed only if sufficient balance is available.
If withdrawal amount exceeds balance, print: "Insufficient Balance"

After performing operations, print the final balance.

Input Format

accountNumber initialBalance depositAmount withdrawAmount

Constraints

1 ≤ accountNumber ≤ 10^7 0 ≤ initialBalance ≤ 10^9 0 ≤ depositAmount ≤ 10^9 0 ≤ withdrawAmount ≤ 10^9

Output Format

If withdrawal fails:

Insufficient Balance Final Balance:

Otherwise:

Final Balance:

Sample Input 0

12345
1000
500
300
Sample Output 0

Final Balance: 1200
Sample Input 1

23456
800
200
1500
Sample Output 1

Insufficient Balance
Final Balance: 1000
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class BankAccount{
    int accountNumber;
    double balance;
    
    public:
    void setAccount(int accno, double bal){
        accountNumber=accno;
        
        if(bal<0){
            balance=0;
        }else{
            balance=bal;
        }
    }
    
    void deposit(double amount){
        balance+=amount;
    }
    
    void withdraw(double amount){
        if(amount>balance){
            cout<<"Insufficient Balance"<<endl;
        }else{
            balance-=amount;
        }
    }
    
    long long getBalance(){
        return balance;
    }
};

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int accountNumber;
    double initialBalance;
    double subjectedDeposite;
    double withdrawAmount;
    
    cin>>accountNumber;
    cin>>initialBalance;
    cin>>subjectedDeposite;
    cin>>withdrawAmount;
    
    BankAccount acc;
    acc.setAccount(accountNumber,initialBalance);
    acc.deposit(subjectedDeposite);
    acc.withdraw(withdrawAmount);
    cout<<"Final Balance: "<<acc.getBalance()<<endl;
    return 0;
}
