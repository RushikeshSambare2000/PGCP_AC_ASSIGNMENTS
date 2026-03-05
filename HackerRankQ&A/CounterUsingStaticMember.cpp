/*
Create a class Counter.

Each time an object is created, increment a static variable count.

After creating all objects, print the total number of objects created.

Input Format

N

Constraints

1 ≤ N ≤ 1000

Output Format

Total Objects:

Sample Input 0

3
Sample Output 0

Total Objects: 3
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Counter{
    public:
    int static count;
    Counter(){
        count++;
    }
};

int Counter::count=0;
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    Counter c1;
    Counter c2;
    Counter c3;
    cout<<"Total Objects: "<<Counter::count;
    return 0;
}
