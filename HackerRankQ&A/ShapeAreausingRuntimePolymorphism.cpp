/*
In object-oriented programming, runtime polymorphism allows a program to decide which function to call during execution using virtual functions.

Create a base class called Shape that contains a virtual function:

area()
Create the following derived classes:

Rectangle
Area formula
length × width


Triangle
Area formula
0.5 × base × height

Circle
Area formula
3.14 × radius × radius
You must call the area() function using a base class pointer so that the correct function executes depending on the shape type.

Input Format

First line contains a number type representing the shape.

1 → Rectangle 2 → Triangle 3 → Circle

Depending on the type:

Rectangle

1

length width
Triangle

2

base height

Circle

3

radius
Constraints

1 ≤ values ≤ 100

Output Format

Print the area of the shape in the format:

Area = <value>
For triangle, print value with 2 decimal precision if required.
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;
class shape{
    public:
   virtual double area()=0;
};
class Rectangle:public shape{
    public:
    int length;
    int width;
    Rectangle(int length, int width){
        this->length=length;
        this->width=width;
    }
    double area(){
        return length*width;
    }
};
class Triangle:public shape{
    public:
    int base;
    int height;
    Triangle(int base, int height){
          this->base=base;
          this->height=height;
    }
    double area(){
        return 0.50*base*height;
    }
};
class Circle:public shape{
    public:
    int radius;
    Circle(int radius){
          this->radius=radius;
    }
    double area(){
        return (3.14*radius*radius);
    }
};

int main() {
    shape* ptr;
    int num;
    cin>>num;
    cout<<endl;
    switch(num){
        case 1 : {
            int Length;
            int Width;
            cin>>Length>>Width;
            Rectangle r(Length, Width);
            ptr=&r;
            cout<<"Area = "<<ptr->area()<<endl;
            break;
        }
          
        case 2:{
            int Base, Height;
            cin>>Base>>Height;
            Triangle t(Base, Height);
            ptr=&t;
            cout<<"Area = "<<ptr->area()<<endl;
            break;
        }
             
        case 3:{
           int Radius;
            cin>>Radius;
            Circle c(Radius);
            ptr=&c;
            cout << "Area = " << fixed << setprecision(2) << ptr->area();
            break; 
        }
            
    }
    return 0;
}
