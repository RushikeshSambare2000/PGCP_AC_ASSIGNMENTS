#include <iostream>
using namespace std;
class Student
{

public:
    int Rollno;
    string Name;
    float Marks;
    Student()
    {
        // default constructor
        cout<<"default constructor called"<<endl;
    }

    Student(int rollno, string name, float marks)
    {
        this->Rollno = rollno;
        this->Name = name;
        this->Marks = marks;
    }

    void DisplayInfo()
    {
        cout << "Roll No : " << this->Rollno << " Name :" << this->Name << " Marks: " << this->Marks << endl;
    }
};
int main()
{
    Student s1;                         // using default constructor
    Student s2(21, "Rushikesh", 99.9f); // using parameterized constructor
    s2.DisplayInfo();
    return 0;
}

/*
When does compiler generate a default constructor?
Ans: compiler generate default constructor automaically when object created. but in case if declared any consdtructor already then compiler does not 
generate any compiler. 

When does it NOT generate one? 
Ans: when we already declared constructor in our program.

Can constructors be overloaded? 
yes constructor can be overloaded. 
*/