#include <iostream>
using namespace std;

class Student
{
    string Name;
    int RollNumber;
    float Marks;
    char Grade;

public:
    void SetStudentInfo()
    {
        cout << "Enter your Name, Roll number and marks" << endl;
        cout << "Name:";
        cin >> Name;
        cout << "Roll Number:";
        cin >> RollNumber;
        cout << "Marks:";
        cin >> Marks;
        if (RollNumber > 0 && Marks <= 100)
        {
            cout << "" << endl;
            cout << "****data updated successfully...****" << endl;
            cout << "" << endl;
        }
        else
        {
            cout << "Enter correct name or roll no or marks" << endl;
            SetStudentInfo();
        }
    }

    void CalculateResult()
    {
        if (Marks >= 90)
        {
            Grade = 'A';
        }
        else if (Marks >= 80 && Marks <= 89)
        {
            Grade = 'B';
        }
        else if (Marks >= 70 && Marks <= 79)
        {
            Grade = 'C';
        }
        else if (Marks >= 60 && Marks <= 69)
        {
            Grade = 'D';
        }
        else if (Marks < 60)
        {
            Grade = 'F';
        }
        cout << "" << endl;
        cout << "  Dear.." << Name << "you got " << Grade << " Grade in Final Exam." << endl;
        cout << "" << endl;
    }

    void display()
    {
        cout << "" << endl;
        cout << "***************Student Information***************" << endl;
        cout << "             Name : " << Name << endl;
        cout << "             Roll Number :" << RollNumber << endl;
        cout << "             Grade :" << Grade << endl;
        cout << "" << endl;
    }
};

int main()
{
    Student s1;
    int flag = 0;
     char data = 'n';
    while (flag == 0)
    {
        cout << "************Welcome to the CDAC Mumbai***************\n what you want to check ? Please select the correct option" << endl;
        cout << "1. Accept Information\n2. Calculate Grade  \n3.Display information\n4. Exit the program. \n"
             << endl;
        int UserInput;
        cin >> UserInput;
        switch (UserInput)
        {
        case 1:
            s1.SetStudentInfo();
            data = 'u';
            break;
        case 2:
            s1.CalculateResult();
            break;
        case 3:
            if (data == 'u')
            {
                s1.CalculateResult();
                s1.display();
            }
            else
            {
                cout << "Student information not available" << endl;
            }

            break;

        default:
            flag = 1;
            cout << "Thank for Visit CDAC Mumbai...";
            break;
        }
    }

    return 0;
}