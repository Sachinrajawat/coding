#include<iostream>
using namespace std;
int main(){
    int x=12;
    int y=13;
    int *ptr1=&x; // int* ptr1,, int * ptr1    all same 
    int* ptr2=&y;
    cout<<ptr1<<"\n";
    cout<<ptr2<<endl;

    cout<<*ptr1<<endl; // for accessing the value
    cout<<*ptr2<<endl; // de-refrencing

    x=23;  // the bucket x updated the value from 12 -> 23
    cout<<x<<"\n";
    cout<<*ptr1<<endl;
    *ptr2=50;
    cout<<y;
    return 0;
}