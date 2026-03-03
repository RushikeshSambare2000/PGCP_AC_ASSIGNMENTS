#include <iostream>
using namespace std;
class Employee
{
    const int EmployeeId;
    string name;
    float salary;

public:
    Employee(int employeeId, string name, float salary) : EmployeeId(employeeId), name(name), salary(salary)
    {
    }

    void display()
    {
        cout << EmployeeId << endl;
        cout << name << endl;
        cout << salary << endl;
    }
};
int main()
{
    Employee E1(12, "Rushikesh", 12000);
    E1.display();

    return 0;
}


/*
1.  Why must const members be initialized in initializer list? 
Ans : Because const members must be initialized at the time of object construction and cannot be assigned later.

2.  What happens if you try to assign the value of a const member inside constructor body? 
Ans : Compilation error: assignment of read-only member.

3.  Why is initializer list faster than assignment?
Ans : Because it directly constructs the data member instead of first default-constructing and then assigning it.

Case A — Assignment inside constructor body
class Test {
    string name;
public:
    Test(string n) {
        name = n;   // assignment
    }
};

What happens internally?

1️⃣ name is default constructed
2️⃣ Then assigned new value

→ Two operations

Case B — Initializer List
class Test {
    string name;
public:
    Test(string n) : name(n) {   // direct initialization
    }
};

What happens internally?

1️⃣ name is directly constructed with n

→ Only one operation
*/