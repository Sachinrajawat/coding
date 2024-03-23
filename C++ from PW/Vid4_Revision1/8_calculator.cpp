// design a calculator toperform a basic arithmetic operations(+,-,/,*.%)
#include<iostream>
using namespace std;
int main(){
    
    int a,b;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"Enter b: ";
    cin>>b;

    cout<<"Enter an operator(+,-,*,/,%): ";
    char op;
    cin>>op;

    switch (op)
    {
    case '+':
    cout<<"Sum is : "<<a+b<<endl;
        break;
    case '-':
    cout<<"Difference is : "<<a-b<<endl;
        break;
    case '*':
    cout<<"Product is : "<<a*b<<endl;
        break;
    case '/':
    cout<<"Division is : "<<a/b<<endl;
        break;
    case '%':
    cout<<"Remainder is : "<<a%b<<endl;
        break;
    
    
    default:
    cout<<"Enter a valid operator";
        break;
    }


    return 0;
}