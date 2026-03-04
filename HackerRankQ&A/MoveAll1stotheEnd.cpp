/*
Given an integer N and an array of N integers, rearrange the array such that:

All elements not equal to 1 appear first (in the same order as input).

All elements equal to 1 appear at the end (in the same order as input).

Print the modified array.

Input Format

N a1 a2 a3 ... aN

Constraints

1 ≤ N ≤ 10^5 -10^9 ≤ ai ≤ 10^9

Output Format

Print the modified array in a single line, space-separated.

Sample Input 0

6
1 0 1 0 1 0
Sample Output 0

0 0 0 1 1 1
Sample Input 1

5
0 0 0 1 1
Sample Output 1

0 0 0 1 1
*/


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n;
    cin>>n;
    int* arr = new int[n];
    int* arr2 = new int[n];
    for(int i=0; i<n; i++){
            cin>>arr[i];
    }
    int index=0;
    
    for(int i=0; i<n; i++){
        if(arr[i]!=1){
            arr2[index++]=arr[i];
        }
    }
    
     for(int i=0; i<n; i++){
        if(arr[i]==1){
            arr2[index++]=arr[i];
        }
    }
    
     for(int i=0; i<n; i++){
        cout<<arr2[i]<<" ";
    }
    
    delete[] arr;
    delete[] arr2;
    return 0;
}
