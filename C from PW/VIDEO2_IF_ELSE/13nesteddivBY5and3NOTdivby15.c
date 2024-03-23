#include<stdio.h>
// nesteddivBY5and3NOTdivby15
int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    if(n%5==0 || n%3==0){
        if(n%15!=0){
            printf("Number is div by 5 or 3 but not div by 15");
        }
        else{
            printf("Number is not div by both 3 or 5");
        }
    }
    return 0;
}