//Given an integer, find out the sum of digits using recursion
//time complexity = 0(n)
//space complexity = 0(n)


#include<iostream>
using namespace std;
int f(int n){
    if(n>=0 and n<=9) return n;   //base case
    int m=n%10;
    n=n/10;
    return f(n)+m;
    
}

int main(){
    int result=f(57123);
    cout<<result;
    return 0;
}