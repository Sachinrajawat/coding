#include<iostream>
using namespace std;
int main(){
    
    int a,b;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"Enter b: ";
    cin>>b;
    int c;
    c=a;
    a=b;
    b=c;
    cout<<"a is: "<<a<<endl;
    cout<<"b is: "<<b<<endl;



    return 0;
}