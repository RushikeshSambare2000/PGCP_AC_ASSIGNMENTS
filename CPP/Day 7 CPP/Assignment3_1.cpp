// Q3.1 Write a program to store an integer value in a variable, then: 
//   Create a pointer pointing to the variable 
//   Create a reference to the same variable 
//   Modify the value using pointer and reference 
// Print the variable after each change. 

#include<iostream>
using namespace std;
int main(){
    int a=10;
    int *ptr=&a;
    int &ref=a;
    
    cout<<"value of variable: "<<a<<endl;
    ref=20;
    cout<<"value of variable by ref: "<<a<<endl;

    *ptr=30;
    cout<<"value of variable by pointer: "<<a<<endl;
    return 0;
}

/* Q3.2 — Explain: 
  Two differences between pointer and reference 
| Pointer                                    | Reference                        |
| ------------------------------------------ | -------------------------------- |
| Stores address of variable                 | Alias (another name) of variable |
| Can be NULL                                | Cannot be NULL                   |
| Can be reseated (change what it points to) | Cannot be reseated               |
| Needs dereferencing (*)                    | No dereferencing needed          |

   Why references cannot be reseated but pointers can 
ans :Because a reference is bound to a variable at the time of initialization.

   Why references cannot be NULL 
Because reference is not a separate memory holder like pointer.
It must alias a valid variable.
 */