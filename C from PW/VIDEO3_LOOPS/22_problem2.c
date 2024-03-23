// wap to print sum of digits of a given number.
#include<stdio.h>

int main(){
    int n,ld;
    printf("Enter a number : ");
    scanf("%d",&n);
    int sum = 0;
    while(n!=0){
        ld = n%10; //last digit
        sum = sum + ld;
        n=n/10;
    }
    printf("The sum of digits are %d",sum);
    return 0;
}