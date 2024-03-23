// wap to print sum of all the even digits of a given number.
#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    int sum = 0;
    while(n!=0){
        int ld=n%10;
        if(ld%2==0){  /// for sum of all the odd digit is ld%2!=0
            sum = sum + ld;
        }
        n = n/10;
    }
    printf("The sum of even digit is %d",sum);
    return 0;
}
