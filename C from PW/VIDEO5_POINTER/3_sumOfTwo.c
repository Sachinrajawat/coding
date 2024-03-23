#include<stdio.h>
int add(int a, int b){       // int add(int x, int y){return x+y}; yee bhi kr skte h
    return a+b;
}
int main(){
    int a;
    printf("Enter a :");
    scanf("%d",&a); 
    int b;
    printf("Enter b :");
    scanf("%d",&b);
    int sum = add(a,b);
    printf("sum is %d",sum);
    return 0;
}