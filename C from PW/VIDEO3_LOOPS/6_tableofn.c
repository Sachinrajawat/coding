#include<stdio.h>

int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    for(int i=1;i<=10;i++){
        int x=i*n;
        printf("%d\n",x);
    }
    return 0;
}