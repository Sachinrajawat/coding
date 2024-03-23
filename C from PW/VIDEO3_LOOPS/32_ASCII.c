#include<stdio.h>
// print all the ASCII values and their equivalent characters of 26 alphabets using a while loop
// a=97,b=96....
// A=65, B=66,C= 67..
int main(){
    /*WHAT is typecasting
    int x = 65;
    printf("%d\n",x);
    char ch = (char)x;
    printf("%c\n",ch);*/
    for(int i = 65;i<=90;i++){
        char ch = (char)i;
        printf("%d -> ",ch);
        
        printf("%c\n",i);
    }
    return 0;
}