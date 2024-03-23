/*
HOW RECURSIVE FUNCTION WORK

methodName( N parameters ){
    if(haltCondition){
        return result
    }
    return methodName(N parameters)
}


*/


//factorial recursive
//space complexity  0(n)
//time complexity   = no. of times func is called * time consumed in one single function
                            // n * c
// time complexity = 0(n) 


#include<iostream>
using namespace std;
int f(int n){
    if(n==1){
        return 1;
    }
    // int ans=n*f(n-1);
    // return ans;
    return n*f(n-1);
}
int main(){
    int n;
    cout<<"Enter n: ";
    cin>>n;
    int result =f(n);
    cout<<result;
    return 0;
}