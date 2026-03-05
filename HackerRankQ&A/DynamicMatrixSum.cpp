/*
Create a dynamically allocated 2D matrix of size N × M.

Calculate the sum of all elements and print it.

Memory must be allocated using new and released using delete.

Input Format

N M

matrix elements

Constraints

1 ≤ N, M ≤ 100

-1000 ≤ element ≤ 1000

Output Format

Sum = value

Sample Input 0

2 3
1 2 3
4 5 6
Sample Output 0

Sum = 21
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    int m;
    cin>>n;
    cin>>m;
    
    int **arr = new int *[n];
    for(int i=0; i<n; i++){
        arr[i]=new int[m];
    }
    int sum=0;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cin>>arr[i][j];
        }
    }
     for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            sum+=arr[i][j];
        }
    };
    for(int i=0; i<n; i++){
        delete[] arr[i];
    }
    cout<<"Sum = "<<sum<<endl;
    
    delete[] arr;
    return 0;
}
