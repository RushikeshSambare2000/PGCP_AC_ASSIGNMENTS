#include<iostream>
using namespace std;
int main(){
    int arr[10];
    try
    {
        for(int i=0; i<20; i++){
        if(i>=10){
            throw "exception : array out of bond";
        }
        else{
             cout<<arr[i]<<endl;
        }
    }
    }
    catch(const char *e)
    {
        cout<<e<< '\n';
    }
    
    return 0;
}