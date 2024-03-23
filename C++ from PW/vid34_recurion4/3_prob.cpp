/*
given a num n. find the increasing sequence from 1 to n without using any loop
input: n=4
output 1 2 3 4
input: n=2
output: 1 2

*/

#include<iostream>
using namespace std;

int f(int n){
    //base 
    if(n<1){
    return;}

    cout<<n;
    return f(n-1);

}
int main(){
    int n;
    cout<<"Enter n: ";
    cin>>n;
    cout<<f(n);

    return 0;
}

