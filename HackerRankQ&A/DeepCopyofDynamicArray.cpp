/*Create a class IntArray that manages a dynamic array.

Requirements

Constructor to allocate memory
Copy constructor to perform deep copy
Destructor to release memory
After copying, modify the original array and show that the copied array remains unchanged.

Input Format

N array elements index value

index value → modify original array.

Constraints

1 ≤ N ≤ 100

Output Format

Print both arrays.

Original: ... Copy: ...

Sample Input 0

5
1 2 3 4 5
2 10
Sample Output 0

Original: 1 2 10 4 5
Copy: 1 2 3 4 5
*/


#include <iostream>
using namespace std;

class IntArray {
private:
    int *arr;
    int n;

public:
    // Constructor
    IntArray(int size) {
        n = size;
        arr = new int[n];
    }

    // Copy Constructor (Deep Copy)
    IntArray(const IntArray &obj) {
        n = obj.n;
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = obj.arr[i];
        }
    }

    // Function to input elements
    void input() {
        for(int i = 0; i < n; i++) {
            cin >> arr[i];
        }
    }

    // Modify element
    void modify(int index, int value) {
        arr[index] = value;
    }

    // Print array
    void print() {
        for(int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }

    // Destructor
    ~IntArray() {
        delete[] arr;
    }
};

int main() {
    int n;
    cin >> n;

    IntArray original(n);
    original.input();

    // Copy array
    IntArray copy = original;

    int index, value;
    cin >> index >> value;

    // Modify original array
    original.modify(index, value);

    cout << "Original: ";
    original.print();

    cout << "Copy: ";
    copy.print();

    return 0;
}