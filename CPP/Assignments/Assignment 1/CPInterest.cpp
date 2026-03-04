#include<iostream>
#include<cmath>
using namespace std;

int main(){
    double principal, compoundI, Totalamount; 
    double rate, time;
    cout<<"enter the Principal Amount :"<<endl;
    cin>>principal;
    cout<<"enter the rate of interest :"<<endl;
    cin>>rate;
    cout<<"enter the time period :"<<endl;
    cin>>time;

    Totalamount=principal * pow((1+rate/100),time);
    compoundI=Totalamount-principal;
    cout<<"the total amount is : "<<Totalamount<<endl;
    cout<<"the total compound interest is : "<<compoundI<<endl;
    
    return 0;
}
