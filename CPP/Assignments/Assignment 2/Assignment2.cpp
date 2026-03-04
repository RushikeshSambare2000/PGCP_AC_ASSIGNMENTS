#include <iostream>
using namespace std;

class BankAccount
{
    double balance;

public:
    string AccountHoderName;
    long AccountNumber;

    BankAccount(double balance, string AccountHoderName, long AccountNumber) : balance(balance), AccountHoderName(AccountHoderName), AccountNumber(AccountNumber)
    {
    }
    // set customer info
    void SetInfo()
    {
        cout << "enter your details:\n";
        cout << "Name :";
        std::cout.flush();
        cin >> AccountHoderName;
        cout << "Amount Number:";
        cin >> AccountNumber;
        cout << "Balance:";
        cin >> balance;
    };
    // get balance
    int GetBalance() const
    {
        return balance;
    }
    // deposite money
    void DepositeBalance(double Amount)
    {
        if (Amount <= 0)
        {
            cerr << "Invalid Amount.. please try again" << endl;
        }
        else
        {
            balance += Amount;
            cout << "Transaction Successfull.. \n Current Balance : " << balance << endl;
        }
    }

    // withdraw money
    void WithdrawMoney(double WithDrawAmount)
    {
        if (balance >= WithDrawAmount)
        {
            balance -= WithDrawAmount;
            cout << "Transaction Successfull.. \n Current Balance : " << balance << endl;
        }
        else
        {
            cerr << "Unsufficient Balace.. please try again" << endl;
        }
    }

    // dipaly details
    void DisplayCustomerInfo()
    {
        cout << "Name : " << AccountHoderName << endl
             << "Account Number : " << AccountNumber << endl
             << "Balance : " << balance << endl;
    }
};
int main()
{
    BankAccount SBI(00, "Rushikesh Sambare", 912111);
    int flag = 0;
    while (flag == 0)
    {

        cout << "************Welcome to State Bank of India***************\n what you want to check? Please select the correct option" << endl;
        cout << "1. Deposite Money into an Existing Account\n2. Withdraw Money from existing Account  \n3.Display Account Details\n4.Edit Details \n5. Check Balance. \n6.Exit" << endl;

        int UserInput;
        cin >> UserInput;
        switch (UserInput)
        {
            // deposite Ammount
        case 1:
            double amount;
            cout << "Enter Amount : " << endl;
            cin >> amount;
            SBI.DepositeBalance(amount);
            break;
        case 2:
         // withdraw money
            double WithDrawAmount;
            cout << "Enter Amount : " << endl;
            cin >> WithDrawAmount;
            SBI.WithdrawMoney(WithDrawAmount);
            break;
        case 3:
            SBI.SetInfo();
            SBI.DisplayCustomerInfo();
            break;
        case 4:
            // set info
            SBI.SetInfo();
            break;
           
        case 5:
        // get balance
             cout << "Balance : " << SBI.GetBalance() << endl;
            break;
        default:
            cout << "Thank for Visit SBI...";
            flag = 1;
            break;
        }
    }

    return 0;
}