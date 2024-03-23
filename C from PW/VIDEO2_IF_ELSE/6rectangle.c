#include<stdio.h>

int main(){
    int area, perimeter;
    int length;
    printf("Enter Length : ");
    scanf("%d",&length);
    int breadth;
    printf("Enter breadth : ");
    scanf("%d",&breadth);
    area = length * breadth;
    perimeter = 2*(length+breadth);
    if(area>perimeter){
        printf("Area is greater than perimeter \n");
        printf("area is %d",area);
    }
    if(area = perimeter){
        printf("Area is equal to perimeter \n");
        printf("area is %d \n",area);
        printf("perimeter is %d",perimeter);

    }
    else{
        printf("perimeter is greater than area \n");
        printf("perimeter is %d",perimeter);
    }    
    return 0;
}