#include <stdio.h>
int main()
{
    int x = 10;
    int y = 20;
    int z = 30;

    int *ptrx = &x;
    int *ptry = &y;
    int *ptrz = &z;

    printf("the valur of x, y and z befor swap is : %d, %d, %d \n ", x, y, z);

    printf("address of x, y and z befor swap is %p, %p, %p \n", ptrx, ptry, ptrz);

    int temp;
    temp = *ptrx;
    *ptrx = *ptrz;
    *ptrz = temp;

    printf("the valur of x, y and z after swap is : %d, %d, %d\n ", x, y, z);

    printf("address of x, y and z after swap is %p, %p, %p \n", ptrx, ptry, ptrz);

    return 0;
}

// output : 
// the valur of x, y and z befor swap is : 10, 20, 30 
//  address of x, y and z befor swap is 0061FF0C, 0061FF08, 0061FF04 
// the valur of x, y and z after swap is : 30, 20, 10
//  address of x, y and z after swap is 0061FF0C, 0061FF08, 0061FF04