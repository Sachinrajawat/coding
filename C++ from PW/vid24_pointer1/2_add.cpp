#include<iostream>
using namespace std;
int main(){
    int x,y;
    cin>>x>>y;
    int *ptrx = &x;
    int *ptry = &y;
    int sum = *ptrx + *ptry;
    cout<<sum;
    return 0;
}