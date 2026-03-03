#include<iostream>
using namespace std;

void swapByValue(int a, int b){
    int temp=a;
    a=b;
    b=temp;
}
void swapByAddress(int *a, int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}
void swapByReference(int &a, int &b){
    int temp=a;
    a=b;
    b=temp;
}
int main (){
    int a=10;
    int b=20;
   swapByValue(a,b);
   cout<<" Call by value : a = "<<a<<" b= "<<b<<endl;
  swapByReference(a,b);
   cout<<" Call by value : a = "<<a<<" b= "<<b<<endl;
    swapByAddress(&a,&b);
   cout<<" Call by value : a = "<<a<<" b= "<<b<<endl;
     return 0;
}

/* Call by value : a = 10 b= 20
 Call by value : a = 20 b= 10
 Call by value : a = 10 b= 20
 
 explain how reference variables act as aliases and how that affects swapByReference(). 
Ans : A reference variable acts as an alias, meaning it becomes another name for the same memory location. 
 Therefore, any modification through the reference directly modifies the original variable."
 int a=10;
 int &ref =a;

 both ref and a is pointing too the same address. 
 */

