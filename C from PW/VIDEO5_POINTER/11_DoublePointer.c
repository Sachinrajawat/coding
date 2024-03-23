#include<stdio.h>

int main(){
    int a = 25;
    int* x =&a;// int * -> int ka address store karta hai
    int ** y = &x; // int** -> int* ka address store karta hai 
    printf("%p\n",&x); // %p se address print hota hai
    printf("%p\n",y);
    return 0;
}