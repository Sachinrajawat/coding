// given a vector arr[] sorted in increasing order of n size and 
// and an integer x, find if there exists a pair in the array whose sum is exactly x.

#include<iostream>
using namespace std;
int main(){
    int arr[]={1,2,3,4,5,6,7};
    int x;
    cout<<"Enter x: ";
    cin>>x;
    int i=0,j=6;
    bool found=false;
    while(i<j){
        if(arr[i]+arr[j]==x){
        found=true;
        break;
    }
    else if(arr[i]+arr[j]<x){
        i++;
    }
    else{
        j--;
    }
    }
    if(found==true) cout<<"YES";
    else cout<<"no";
    return 0;
}