// program to find the nth fibonacci number

// 0 1 1 2 3 5 8 13 21 ......

//fib(n) = fib(n-1)+fib(n-2)

//space complextiy    0(n)
// time complexity    0(2^n)
#include<iostream>
using namespace std;

int fib(int n){
    if(n==0 or n==1) return n;
    return fib(n-1)+fib(n-2);
}
int main(){
    int result=fib(10);
    cout<<result;
    return 0;

}