// wap to divide people into 3 age groups depending upon their age


#include<iostream>
using namespace std;
int main(){
    int age;
    cout<<"Enter age: ";
    cin>>age;
    if(age>18){
        cout<<"Adult";
    }
    else if(age>12 && age<18 ){
        cout<<"Teenager";
    }
    else{
        cout<<"Child";
    }


    return 0;
}