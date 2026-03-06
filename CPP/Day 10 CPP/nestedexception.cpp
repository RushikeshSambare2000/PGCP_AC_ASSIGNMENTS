/*
Nested Exception Handling in C++
Nested exception handling means placing a try-catch block inside another try or catch block. 
This allows a program to handle different types of errors at different levels.
It is useful when:
An exception occurs inside another exception handling block.
You want multiple levels of error handling.
try {
    // outer try block

    try {
        // inner try block
    }
    catch(type1 e) {
        // inner catch
    }

}
catch(type2 e) {
    // outer catch
}

*/

#include <iostream>
using namespace std;

int main() {
    try {
        cout << "Outer try block\n";

        try {
            cout << "Inner try block\n";
            throw 10;
        }

        catch(int x) {
            cout << "Inner catch: Exception = " << x << endl;
            throw;   // rethrowing exception
        }

    }

    catch(int y) {
        cout << "Outer catch: Exception handled again = " << y << endl;
    }

    return 0;
}

/*
Output: 
Outer try block
Inner try block
Inner catch: Exception = 10
Outer catch: Exception handled again = 10
*/