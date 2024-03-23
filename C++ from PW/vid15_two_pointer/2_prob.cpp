/*
given an array of integers 'a',  move all the even integers at the beginning of the aray folowed by the odd integers. The relative order
of odd or even intergers does not matter. Return any array that satisfies the condition.

*/


#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter n: ";
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int array[n];
    int j=0;

    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            array[j++]=arr[i];
            
        }
    }    
    for(int i=0;i<n;i++){
        if(arr[i]%2!=0){
            array[j++]=arr[i];
        }
    }

    for(int i=0;i<n;i++){
        cout<<array[i]<<" ";
    }
    return 0;
}