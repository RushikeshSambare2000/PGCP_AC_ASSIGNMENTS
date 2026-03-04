#include<iostream>
using namespace std;

float AreaofCircle(float r, float pi){
    return pi*(r*r);
}

float PerimeterofCircle(float r,float pi){
    return pi*(2*r);
}
int main(){
    const float pi=3.14159f;
    float radius=10;
    // pi=3.0f;   //invalid :  error: assignment of read-only variable 'pi'
    printf("area of circle is %.4f \n",AreaofCircle(radius,pi));
    printf("perimeter of circle is %.4f ",PerimeterofCircle(radius,pi));
  
    return 0;
}