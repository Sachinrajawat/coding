/* Any year is input through the keyboard. write a program to determine whether the year is leap year or not.*/
#include<stdio.h>

int main(){
    int year;
    printf("Enter year : ");
    scanf("%d",&year);
    if(year%4==0){
        printf("year is leap year");
    }
    else{
        printf("Year is not a leap year");
    }
    return 0;
}