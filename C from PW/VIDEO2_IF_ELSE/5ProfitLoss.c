#include<stdio.h>

int main(){
    int profit,Loss;
    int CP; // COst price
    printf("COST PRICE : ");
    scanf("%d",&CP);
    int SP; // Selling price
    printf("SELLING PRICE : ");
    scanf("%d",&SP);
    if(SP>CP){
        printf("Seller made the profit \n");
        profit = SP - CP;
        printf("The profit is %d",profit);
    }
    else{
        printf("Seller made the Loss \n");
        Loss = CP - SP;
        printf("The Loss is %d",Loss);
    }
    return 0;
}