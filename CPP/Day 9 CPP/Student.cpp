#include<iostream>
using namespace std;
class Student{
    protected:
    int rollNo;
    public:
    Student(){
      rollNo=0;
      cout<<"Default constructor of Student"<<endl;
    }
    Student(int rollno){
        rollNo=rollno;
         cout<<"para constructor of Student"<<endl;
    }
    virtual void display(){
        cout<<"Roll no:"<<endl;
    }

};

class result:public Student{
    public:
    float marks;
    result(){
        marks=0;
        cout<<"Default constructor of Result"<<endl;
        //default constructor
    }
     result(int rollno, float marks=0):Student(),marks(marks){
           cout<<"para constructor of Result"<<endl;
     }

     void display(){
        cout<<"Roll no : "<<rollNo<<endl;
        cout<<"marks :"<<marks<<endl;
     }
    
};
int main(){
    result r1;
    Student* ptr;
    ptr=&r1;   //upcasting
    ptr->display();
    return 0;
}

/*
output : 
Decault constructor of Student
Decault constructor of Result
Roll no : 0
marks :0
*/

/*
Which constructor will be called first: Student or Result?
Ans : Student Default constrctor
Does the program demonstrate early binding or late binding?
Ans : Yes
Why is the display() function declared as virtual.
Ans:We implemented late binding here, we override display method in derived class.
*/