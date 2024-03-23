#include<stdio.h>

int main(){
    int Ram,Shyam,Ajay;
    printf("Ram age :");
    scanf("%d",&Ram);    
    printf("Shyam age :");
    scanf("%d",&Shyam);    
    printf("Ajay age :");
    scanf("%d",&Ajay);
    if(Ram < Shyam)
{
    if(Ajay > Shyam){
        printf("Ram is Youngest");
    }
    else{
        printf("Shyam is youngest");
    }
} 
else{
    if(Shyam > Ajay){
        printf("Ajay is youngest");
    }
    else{
        printf("Shyam is youngest");
    }
} 

    return 0;
}