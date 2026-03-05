#include<iostream>
using namespace std;
class base{
    public:
    base(int x){
       cout<<"base constructor"<<endl;
    }
};

class derived : public base{
    public:
    int y;
    derived(int x, int y): base(x){
         cout<<"derived constructor"<<x<<y<<endl;  //defauly y value x=10
    }

    derived(int x):derived(x,0){
        cout<<"delegation constructor"<<endl;
    }
};
int main(){
    derived d1(10);
// base constructor
// derived constructor 10 0
// delegation constructor
    return 0;
}