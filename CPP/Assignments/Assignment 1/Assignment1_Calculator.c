#include<stdio.h>

int main(){
    float math_marks;
    float english_marks;
    float history_marks;
    float science_marks;
    float marathi_marks;
    printf("enter the marks for math : ");
    scanf("%f",&math_marks);
    printf("enter the marks for  english : ");
     scanf("%f",&english_marks);
    printf("enter the marks for history : ");
     scanf("%f",&history_marks);
    printf("enter the marks for science : ");
     scanf("%f",&science_marks);
    printf("enter the marks for marathi : ");
     scanf("%f",&marathi_marks);
    float percentage=(math_marks+english_marks+history_marks+science_marks+marathi_marks)/5;
    (percentage >= 75) ? printf("marks is \n Math : %f \n English : %f \n History : %f \n Science : %f \n Marathi : %f \n percentage is : %f \n Grade A ",math_marks, english_marks, history_marks, science_marks, marathi_marks, percentage) :
    (percentage >= 60 && percentage <75) ? printf("marks is \n Math : %f \n English : %f \n History : %f \n Science : %f \n Marathi : %f \n percentage is : %f \n Grade B ",math_marks, english_marks, history_marks, science_marks, marathi_marks, percentage) :
    (percentage>100)?printf("marks is \n Math : %f \n English : %f \n History : %f \n Science : %f \n Marathi : %f \n percentage is : %f \n Grade C ",math_marks, english_marks, history_marks, science_marks, marathi_marks, percentage) :
                    printf("marks is \n Math : %f \n English : %f \n History : %f \n Science : %f \n Marathi : %f \n percentage is : %f \n Grade Fail ",math_marks, english_marks, history_marks, science_marks, marathi_marks, percentage) ;
    return 0;

}