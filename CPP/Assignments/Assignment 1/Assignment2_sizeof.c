#include<stdio.h>
int main(){
    int INT_;
    short int short_int;
    long int long_int;
    long long int long_long_int;
    unsigned int unsigned_int;
    float Float_;
    double Double_;
    long  double Long_double;
    char Char_;
    printf("size of int is : %d \n", sizeof(INT_));
    printf("size of short int is : %d\n",sizeof(long_int));
    printf("size of long int is : %d \n", sizeof(long_int));
    printf("size of long long int is : %d\n", sizeof(long_long_int));
    printf("size of unsigned int is %d\n", sizeof(unsigned_int));
    printf("size of float is : %d\n",sizeof(Float_));
    printf("size of double is : %d\n", sizeof(Double_));
    printf("sizeof long double is : %d\n", sizeof(Long_double));
    printf("size of char is : %d\n",sizeof(Char_));



    return 0;
}