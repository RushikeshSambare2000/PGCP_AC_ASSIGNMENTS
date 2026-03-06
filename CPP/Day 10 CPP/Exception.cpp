#include<iostream>
using namespace std;
int main(){
    int num;
    cin>>num;
    try
    {
        if(num>10){
            throw "exception : num is greater than 10";
            num=20;
        }
    }
    catch(const char *e)
    {
        cout<<e<< '\n';
    }
    
    return 0;
}