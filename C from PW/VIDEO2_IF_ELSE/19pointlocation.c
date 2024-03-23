#include<stdio.h>
/* Given a point (x,y), write a program to find out if it lies on the x-axis, y-axis or at the origin, viz. (0,0).*/
int main(){
    int x,y;
    printf("Enter the coordinates : ");
    scanf("%d %d",&x, &y);
    if(x==0 && y==0){
        printf("point at the origin");
    }
    else if(x==0){
        printf("point lies on y axis");
    }
    else if(y==0){
        printf("point lies on x axis");
    }
    else{
        printf("Point does not lies on x,y axis or at origin");
    }
    return 0;
}