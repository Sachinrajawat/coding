// check three points (x1,y1),(x2,y2), and (x3,y3) are in one straight line
// slop of two points are same
#include<stdio.h>

int main(){
    double x1,y1,x2,y2,x3,y3;
    printf("Enter x1, y1, x2, y2, x3, y3");
    scanf("%lf %lf %lf %lf %lf %lf",&x1, &y1, &x2, &y2, &x3, &y3);
    double m1=(y2-y1)/(x2-x1);
    double m2=(y3-y2)/(x3-x2);
    if(m1=m2)
    {
        printf("All points are in straight line");
    }
    else{
    printf("Points are not in straight line");
    }

    return 0;
}
