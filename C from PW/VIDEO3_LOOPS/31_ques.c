#include<stdio.h>
/* write a code a power b*/
int main(){
    int a,b;
    printf("Enter a : ");
    scanf("%d",&a);
    printf("Enter b : ");
    scanf("%d",&b);
    int power = 1;
    for(int i=1;i<=b;i++){
        power = power*a;
    }
    printf("%d the power %d is %d",a,b,power);
    return 0;
}