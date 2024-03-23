//pascal Triangle
/*
                1
            1       1
        1       2       1
    1       3       3       1
1       4       6       4       1
.
.
.

*/
/*  LOGIC
    0   1   2   3   4   5   6           THIS IS r
0   1=0C0
1   1=1C0  1=1C1
2   1 2=2C1 1                          ///  all values are nCr 
3   1   3   3   1
4   1   4   6   4   1   
5   1   5   10  10  5   1


THIS IS N


*/
// Combination and Permutation
// nCr = n!/r!*(n-r)!
#include<stdio.h>
int factorial(int x){
    int fact  = 1;
    for(int i =2;i<=x;i++){
        fact = fact*i;
       
    }
     return fact;
}
int combination(int n, int r){
    int ncr  = factorial(n)/(factorial(r)*factorial(n-r));
    return ncr;

}
int main(){
    int n;
    printf("Enter n : ");
    scanf("%d",&n);
    for(int i =0;i<=n;i++){
        for(int j=0;j<=i;j++){
        int icj = combination(i,j);
        printf("%d ",icj);
    }printf("\n");
    }
    
    return 0;
}