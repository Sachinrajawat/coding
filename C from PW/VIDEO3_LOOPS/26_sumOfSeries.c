#include<stdio.h>
// sum of series 1-2+3-4+5-6.....upto n
int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    int sum = 0;
    for(int i;i<=n;i++)
    {
        if(i%2!=0) sum = sum + i;
        else sum = sum - i;
    }
    printf("The sum is : %d",sum);
    return 0;
}