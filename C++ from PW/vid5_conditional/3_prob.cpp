// wap to print the value if it divisible by 3 or 5

#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"Enter a number: ";
    cin>>a;
    if(a%3==0 || a%5==0){
        cout<<"number is divisible by 3 or 5 ";
    }
    else{
        cout<<"Number is not divisible by 3 or 5";
    }


    return 0;
}