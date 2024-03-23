// 100,50,25....upto 'n' 
#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    float a=1;
    for(int i=1;i<=n;i++){
        printf("%d ",&a);
        a=a/2;
    }
    return 0;
}