/*
You are required to create a struct named Student with the following data members:

int rollNumber
string name
float marks
Write a program that:

Reads the student details.
Stores them inside a Student structure.
Prints the details.
Prints the grade based on marks:

Marks ≥ 75 → Grade A
Marks ≥ 60 and < 75 → Grade B
Marks ≥ 40 and < 60 → Grade C
Marks < 40 → Grade F
Input Format

rollNumber name marks

Constraints

1 ≤ rollNumber ≤ 10^6 0 ≤ marks ≤ 100 name contains only alphabet characters

Output Format

Roll Number: Name: Marks: Grade:

Sample Input 0

101
Rahul
82.5
Sample Output 0

Roll Number: 101
Name: Rahul
Marks: 82.5
Grade: A
Sample Input 1

102
Priya
60
Sample Output 1

Roll Number: 102
Name: Priya
Marks: 60
Grade: B

*/


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
struct Student{
    int rollNumber;
    string name;
    float marks;
    char grade;
};

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    Student s1;
    cin>>s1.rollNumber;
    cin>>s1.name;
    cin>>s1.marks;
    
    if(s1.marks>=75){
        s1.grade='A';
    }
    else if(s1.marks>=60){
        s1.grade='B';
    }
    else if(s1.marks>=40){
        s1.grade='C';
    }else{
        s1.grade='F';
    }
        
    cout<<"Roll Number: "<<s1.rollNumber<<endl;
    cout<<"Name: "<<s1.name<<endl;
    cout<<"Marks: "<<s1.marks<<endl;
    cout<<"Grade: "<<s1.grade<<endl;
    
    return 0;
}
