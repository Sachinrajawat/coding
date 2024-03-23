#include<stdio.h>

int main(){
    int a,b,c;
    printf("Side a : \n");
    scanf("%d",&a);
    printf("Side b : \n");
    scanf("%d",&b);
    printf("Side c : \n");
    scanf("%d",&c);
    if(a+b>c && b+c>a && a+c>b){
    printf("Valid tringle");
    }
    else{
        printf("Not a valid triangle");
    }
    
    return 0;
}