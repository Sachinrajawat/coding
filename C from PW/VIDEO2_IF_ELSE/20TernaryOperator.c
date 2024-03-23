#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    // ternary operator
    // expression1 ? exp2 : exp3
    // exp1 true hone pr exp2 run hoga otherwise exp3 run hoga
    n%2==0 ? printf("Even number") : printf("Odd number") ;


    /*if(n%2==0){
        prinf("Even number");
    }
    else{
        printf("Odd number");
    }*/

    return 0;
}