// factorial of first n terms
#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    int fact = 1;
    for(int i = 1;i<=n;i++){
        
        fact = fact * i;
        printf("Factorial of %d is %d\n",i,fact);

    } 
    return 0;
}