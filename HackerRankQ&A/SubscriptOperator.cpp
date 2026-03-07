/*In C++, the subscript operator [] can be overloaded to provide custom access behavior to class objects. This allows objects to behave like arrays while still maintaining encapsulation and safety.

You are required to create a class named IntArray that internally stores an integer array.

The class should:

Store N integers
Overload the subscript operator []
Allow accessing elements using the syntax

array[index

After storing the elements, a specific index will be provided. Using the overloaded [] operator, print the value at that index.

Input Format

N

a1 a2 a3 ... aN

index

Where:

N = number of elements

Next line contains N integers

Last line contains the index to access

Constraints

1 ≤ N ≤ 100

-10^6 ≤ element ≤ 10^6

0 ≤ index < N

Output Format

Print the element present at the given index.

Sample Input 0

5
10 20 30 40 50
3
Sample Output 0

40*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class IntArray{
    public:
    int N;
    int arr[];
    IntArray(int N){
        this->N=N;
        arr[N];
        for(int i=0; i<N; i++){
            cin>>arr[i];
        }
    }
    
    int& operator [](int index){
        return arr[index];
    }
    
};

int main() {
    int num;
    cin>>num;
    IntArray A(num);
    int index;
    cin>>index;
    cout<<A[index]<<endl;
    
    return 0;
}