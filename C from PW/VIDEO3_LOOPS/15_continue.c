#include<stdio.h>
// print all the odd number between 1 to 100 using continue
int main(){
    for(int i = 1; i <= 100; i++)
    {
        if(i%2 == 0) //(i%2 != 0) for all even number
        {
            continue;  // skip karo us round ko 
        }
        printf("%d ",i);
    }
    return 0;
}