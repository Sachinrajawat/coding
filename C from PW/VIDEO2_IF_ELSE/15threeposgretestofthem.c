#include<stdio.h>

int main(){
    int a,b,c;
    printf("enter a : ");
    scanf("%d",&a);
    printf("enter b : ");
    scanf("%d",&b);
    printf("enter c : ");
    scanf("%d",&c);
    if(a>b){ // b is out of race
        if(a>c){
            printf("%d is gratest",a);
        }
        else // a<c   ->  b < a < c
        printf("%d is greatest",c);
    }
    else { // b>a  -> a ab sbse bada to nhi hai
        if(b>c)
        printf("%d is greatest",b);
        else //c > b 
        {
            printf("%d is greatest",c);
        }
    }
    return 0;
}