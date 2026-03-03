
/*
Q4.2 Repeat Q4.1 using malloc and free.
*/
#include<iostream>
#include<cstdlib>
using namespace std;

int main() {

    int n = 5;

    int *arr = (int*) malloc(n * sizeof(int));

    if(arr == nullptr) {
        cout << "Memory allocation failed";
        return 1;
    }
    cout<<"enter the value in array";
    for(int i = 0; i < n; i++) {
        cin>>arr[i];
    }

    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    free(arr);   
    arr=nullptr; //Heap memory is freed 
                  //Pointer variable still exists in stack


    //   for(int i = 0; i < n; i++) {    //giving undefined behaviour if we try to print arr data after delete
    //     cout << arr[i] << " ";
    // }
    cout<<sizeof(arr);  // showing size of arr because its is pointer

    return 0;
}
// }

/*
Q4.3 — Explain:
  Why constructors are not called when using malloc
ans : working of construtor and malloc are different, malloc is a function which only allocated new memory dynamically. 
      and constructor is used to initialized a intance variable an instace member functon. 
  Why new is preferred in C++
  The new operator performs memory allocation and object initialization so new op does both step of objec life cycle 
  that's why new keyword is preffered in cpp.
  Difference in return types and initialization

  Why malloc cannot initialize complex types
Because complex types require:
-Constructor execution
-vtable setup (for virtual functions)
-Proper member initialization
-Base class construction
*/
