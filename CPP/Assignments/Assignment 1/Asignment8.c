#include <stdio.h>

int abs(int *num)
{
    if (*num < 0)
    {
        *num = -*num;
    }
    return *num;
}

int clamp(int val, int lo, int hi)
{
    (val<lo)?printf("lo"):
    (val>hi)?printf("hi"):printf("val");
}

int main()
{
    // to conver into absolute
    int num;
    printf("enter the number which you want to convert into absolute : \n");
    scanf("%d", &num);
    printf("Absolute value of %d is : %d \n", num, abs(&num));

    // low and high value
    int low, high, value;
    printf("Enter the value of low, high and value\n");
    scanf("%d %d %d", &value, &low, &high);
   
    printf("%d",clamp(value,low,high));

    return 0;
}


/*
val     lo      hi     absolute(val)    clamp(val, lo, hi)
-15     -10     10         15                 lo
---------------------------------------------------------
0       -10     10          0                 val
---------------------------------------------------------
25      -10     10          25                hi
---------------------------------------------------------
-3       0      5           3                 lo
*/