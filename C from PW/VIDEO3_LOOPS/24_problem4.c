// wap to print reverse of a given number
#include<stdio.h>

int main(){
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    int rev = 0;
    while(n>0){
        rev = rev*10;
        int ld = n%10;
        rev = rev + ld;
        n=n/10;
    }
    
    printf("The reverse of number is %d",rev);
    return 0;
}