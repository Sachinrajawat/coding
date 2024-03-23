// find maximum of three using nested if else
#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cout<<"Enter a:";
    cin>>a;
    cout<<"Enter b:";
    cin>>b;
    cout<<"Enter c:";
    cin>>c;
    if(a>b){
        if(a>c){
            cout<<"a is greater";
        }
        else
        cout<<"c is greater";
        }
    else 
    cout<<"b is greater";


    return 0;
}