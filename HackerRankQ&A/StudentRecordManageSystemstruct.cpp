/*
This challenge tests your understanding of:

struct in C++
Array / vector of struct
Loop processing
Conditional grading
Basic aggregation (average calculation)
You are required to create a struct named Student with the following members:

int rollNumber
string name
float marks
The program must:

Read an integer N (number of students).
Store details of N students using an array or vector of struct.
Print each student’s details along with their grade.
Print the class average marks (rounded to 2 decimal places).
Grade Rules:

Marks ≥ 75 → Grade A
Marks ≥ 60 and < 75 → Grade B
Marks ≥ 40 and < 60 → Grade C
Marks < 40 → Grade F
Input Format

N rollNumber name marks rollNumber name marks ...

Constraints

1 ≤ N ≤ 1000 1 ≤ rollNumber ≤ 10^6 0 ≤ marks ≤ 100

Output Format

For each student print:

Roll Number: Name: Marks: Grade:

After printing all students, print:

Class Average:

Sample Input 0

3
101 Rahul 82.5
102 Priya 60
103 Amit 35
Sample Output 0

Roll Number: 101
Name: Rahul
Marks: 82.5
Grade: A
Roll Number: 102
Name: Priya
Marks: 60
Grade: B
Roll Number: 103
Name: Amit
Marks: 35
Grade: F
Class Average: 59.17
Sample Input 1

4
101 Rahul 85
102 Priya 72
103 Amit 55
104 Neha 30
Sample Output 1

Roll Number: 101
Name: Rahul
Marks: 85
Grade: A
Roll Number: 102
Name: Priya
Marks: 72
Grade: B
Roll Number: 103
Name: Amit
Marks: 55
Grade: C
Roll Number: 104
Name: Neha
Marks: 30
Grade: F
Class Average: 60.50
Sample Input 2

3
201 Arjun 75
202 Meera 60
203 Kabir 40
Sample Output 2

Roll Number: 201
Name: Arjun
Marks: 75
Grade: A
Roll Number: 202
Name: Meera
Marks: 60
Grade: B
Roll Number: 203
Name: Kabir
Marks: 40
Grade: C
Class Average: 58.33
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;
struct Student{
    int rollNumber;
    string name;
    float marks;
};

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    
    vector<Student>students(n);
    float totalMarks=0;
    
    for(int i=0; i<n; i++){
        cin>>students[i].rollNumber;
        cin>>students[i].name;
        cin>>students[i].marks;
        totalMarks+=students[i].marks;
    }
    
    for(int i=0; i<n; i++){
        char grade;
        if(students[i].marks>=75){
            grade='A';
        }
        else if(students[i].marks>=60){
            grade='B';
        }
        else if(students[i].marks>=40){
            grade='C';
        }else{
            grade='F';
        }
        cout<<"Roll Number: "<<students[i].rollNumber<<endl;
        cout<<"Name: "<<students[i].name<<endl;
        cout<<"Marks: "<<students[i].marks<<endl;
        cout<<"Grade: "<<grade<<endl;
    }
    
    float average=totalMarks/n;
    // cout<<fixed<<setprecision(2);
    cout<<fixed << setprecision(2)<<"Class Average: "<<average<<endl;
    
    return 0;
}
