#include<stdio.h>
float celsiusToFahrenheit(float c){
    return (c * 9/5) + 32;

}
float fahrenheitToCelsius(double f){
return (f - 32) * 5/9.0;

}
int main(){
    float temp_incel;
    float temp_infahrenheit;
    printf("please enter the value of temperature in celsius :");
    scanf("%f",&temp_incel);
    printf("pleae enter value of temp in fahrenheit :");
    scanf("%ff",&temp_infahrenheit);
    printf("Temperature in celsius : %.2f\n",celsiusToFahrenheit(temp_incel));
    printf("Temperature in fahrenheit :%.2f",fahrenheitToCelsius(temp_infahrenheit));
    return 0;
    
}