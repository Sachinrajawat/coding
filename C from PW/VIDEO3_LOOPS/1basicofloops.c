#include<stdio.h>

/*int main(){
    for(int i=0;i<=5;i++){
        printf("Hello\n");
    }
    return 0;
}*/


#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    for(int i=1;i<=n;i=i+1){ //i++ is equal to i=i+1
        printf("Hello world\n");
    }
    return 0;
}