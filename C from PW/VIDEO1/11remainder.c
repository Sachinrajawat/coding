#include<stdio.h>
// taking input of 2 number
int main(){
    int a,b; // a>b
    printf("Enter Dividend : ");
    scanf("%d",&a);
    printf("Enter Dividsor : ");
    scanf("%d",&b); 
    int q =a/b;
    int r = a - b*q; // Divisor * Quotient + Remainder = Dividend
    printf("The Remaindeer when %d is divided by %d is : %d",a,b,r);
    return 0;
}