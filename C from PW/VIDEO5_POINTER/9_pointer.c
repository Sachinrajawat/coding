#include<stdio.h>

int main(){
    int a = 5;
    int* x = &a;
    *x = 7; // a is change
    printf("%d\n",a); // %p se address print hota h

    return 0;
}