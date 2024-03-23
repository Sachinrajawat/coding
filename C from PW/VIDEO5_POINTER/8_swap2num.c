#include<stdio.h>

int main(){
    int a;
    printf("Enter a : ");
    scanf("%d",&a);
    int b;
    printf("Enter b : ");
    scanf("%d",&b);
    /*int temp; // temporery
    temp = a;
    a = b;
    b= temp;*/

    // 2nd method
    a=a+b;
    b=a-b;
    a=a-b;
    printf("The value of a is %d\n",a);
    printf("The value of a is %d\n",b);
    return 0;
}