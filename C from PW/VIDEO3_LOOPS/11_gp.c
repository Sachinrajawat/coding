// 3  12  48 ....
#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    int a =1;
    for(int i=1;i<=n;i++){
        printf("%d ",a);
        a = a*4;
    }
    return 0;
}