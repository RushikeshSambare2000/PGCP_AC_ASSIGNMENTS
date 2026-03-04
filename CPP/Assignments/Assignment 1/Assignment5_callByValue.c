#include <stdio.h>

//call by value
/*void doubleIt(int n) {
 n = n * 2;
 printf("Inside doubleIt: %d\n", n);
}

int main() {
 int num = 7;
 doubleIt(num);
 printf("In main after call: %d\n", num);
 return 0;
}
 */

 //call by reference
 void doubleIt(int *n) {
 *n = *n * 2;
 printf("Inside doubleIt: %d\n", *n);
}

int main() {
 int num = 7;
 doubleIt(&num);
 printf("In main after call: %d\n", num);
 return 0;
}