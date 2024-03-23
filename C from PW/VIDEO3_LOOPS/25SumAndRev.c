#include<stdio.h>
// wap to print the sum of given number and its reverse
int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    int sum = 0;
    int rev = 0;
    while(n>0){
        rev = rev*10;
        int ld = n%10;
        rev = rev + ld;
        n=n/10;
       
    }
    printf("rev is %d\n",rev);
    sum = n + rev;
    printf("Sum is %d",sum);
    return 0;
}