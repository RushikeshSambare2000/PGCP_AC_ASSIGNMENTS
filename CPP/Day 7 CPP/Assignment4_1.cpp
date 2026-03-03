/*Q4.1 Write a program that:
  Uses new to allocate an array of 5 integers
  Takes user input
  Prints the values
  Deallocates memory using delete[]
*/

#include <iostream>
using namespace std;
int main()
{
    int n=5;
    int *arr = new int[n];
    cout << "enter the value in array :" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++)
    {
        cout<< " "<<arr[i]<<endl;
    }
     
    delete[] arr;   //showing size because arr is a pointer an act  as a dagging pointer
    arr=nullptr;

    //  for (int i = 0; i <= n; i++)
    // {
    //     cout<< " "<<arr[i]<<endl;
    // }

    cout<<sizeof(arr);
    return 0;
}

