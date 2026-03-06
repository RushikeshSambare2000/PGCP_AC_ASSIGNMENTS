/*
A company wants to represent its employee hierarchy using C++ classes.

The base class Person stores common personal information.

Two classes inherit from Person:

Student – represents the academic background of the person.
Employee – represents the employment information of the person.
Finally, a class Manager inherits from both Student and Employee.

This creates the following inheritance structure:

    Person
   /      \
Student   Employee

   \      /

    Manager
Your task is to implement these classes such that Person data is stored only once.

Class Requirements Person, Data member: string name

Student Inherits from Person

Employee Inherits from Person Data member: int id

Manager Inherits from Student and Employee Data member: int salary

YOUR Task
Read the name, employee ID, and salary from input.
Create a Manager object and print the information in the following format.
Input Format

name id salary

Constraints

1 ≤ id ≤ 10000

1 ≤ salary ≤ 10^7

Name length ≤ 50

Output Format

Name:

ID:

Salary:

Sample Input 0

Rahul
101
60000
Sample Output 0

Name: Rahul
ID: 101
Salary: 60000
*/


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Person{
    public:
    string name;
    Person(string name){
        this->name=name;
    }
};

class Student : public Person{
    public:
    Student(string name) : Person(name) {}
};

class Employee : public Person{
    public:
    int id;
    Employee(string name , int id):Person(name){
        this->id=id;
    }
};

class Manager : public Student, public Employee{
    public:
    int salary;
    Manager(string name, int id, int salary):Student(name),Employee(name,id),salary(salary){
        
    };
    void Display(){
        cout<<"Name: "<<Employee::name<<endl;
        cout<<"ID: "<<id<<endl;
        cout<<"Salary: "<<salary<<endl;
    }
};

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string name;
    int id;
    int salary;
    cin>>name>>id>>salary;
    
    Manager M(name,id,salary);
    M.Display();
    return 0;
}
