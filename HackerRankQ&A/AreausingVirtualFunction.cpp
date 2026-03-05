/*
Create a base class Shape with a virtual function:

area()
Create two derived classes:

Rectangle
Circle
Area formulas:

Rectangle → length * width Circle → 3.14 * r * r

Input a type:

1 → Rectangle 2 → Circle

Compute and print the area.

Input Format

For rectangle

1
length width
For circle

2
radius
Constraints

1 ≤ values ≤ 100

Output Format

Area =

Sample Input 0

1
5 4
Sample Output 0

Area = 20
Sample Input 1

2
7
Sample Output 1

Area = 153.86
*/


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class shape{
    public:
    virtual void area()=0;
};
class rectangle:public shape{
    public:
    float l;
    float w;
    rectangle(float length, float width){
        l=length;
        w=width;
    }

    void area(){
        cout<<"Area = "<<l*w<<endl;
    }
};
class circle:public shape{
    public:
    float r;
    circle(float radius){
        r=radius;
    }
    void area(){
        cout<<"Area = "<<3.14*r*r<<endl;
    }
};

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int num;
    cin>>num;
    if(num==1){
        float l,w;
        cin>>l>>w;
        rectangle s1(l,w);
        s1.area();
    }
    else if(num==2){
        float r;
        cin>>r;
        circle c1(r);
        c1.area();
    }
    return 0;
}