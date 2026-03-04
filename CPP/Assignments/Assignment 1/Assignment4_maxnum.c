#include<stdio.h>
void maxnumber(int num1, int num2, int num3, int *max_num,int  *min_num){
       if(num1>=num2 && num1>=num3){
          *max_num=num1;
       }
       else if(num2>num1 && num2>=num3){
        *max_num=num2;
    
       }else{
        *max_num=num3;
       }

       if(num1<=num2 && num1<=num3){
        *min_num=num1;
       }
       else if(num2<=num1 && num2<=num3){
        *min_num=num2;
       }else{
        *min_num=num3;
       }
}

int main(){

    int num1;
    int num2;
    int num3;
    int max__num;
    int min__num;
    printf("enter 3 numbbers \n");
    scanf("%d %d %d",&num1,&num2,&num3);
    maxnumber(num1, num2, num3, &max__num, &min__num);
    printf("maximun number : %d \n minumum number :  %d",max__num,min__num);

}