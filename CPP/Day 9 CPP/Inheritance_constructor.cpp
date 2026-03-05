#include <iostream>
using namespace std;

class base
{
public:
    int x = 10;

    base() : x(0)
    {
        cout << "default base constructor" << endl;
    }
    base(int x) : x(x)
    {
        cout << "base para constructor" << endl;
    }
};

class derived : public base
{
public:
    int y;
    derived() : y(0)
    {
        cout << "default derived constructor" << endl;
    }

    derived(int y) : y(y)
    {
        cout << "derived para constructor" << endl;
    }

    derived(int y, int x) : y(y), base(x)
    {
        cout << "derived para consructor with base" << endl;
    }
};
int main()
{
    // derived d1(10);  //default base constructor
    // derived para constructor

    base b1(10); // base para constructor

    derived d2(10, 20); // base para constructor
                        // derived para consructor with base
    return 0;
}