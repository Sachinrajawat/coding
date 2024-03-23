/*Rotate the given array 'a' by k steps, where k is non-negative
NOTE: k can be greater than n as well where n is the size of array 'a'  */

#include<iostream>
using namespace std;
int main(){
    int n=5;
    int array[5]={};
    cout<<"Enter array: ";
    for(int i=0;i<5;i++){
        cin>>array[i];

    }
    int k;
    cout<<"Enter k: ";
    cin>>k;
    k=k%n; //k can be greater than n
    int arr[5];
    int j=0;

    // inserting last k elements in ans array
    for(int i=n-k;i<n;i++){
        arr[j++]=array[i];
        
    }
    
    // inserting first n-k elements in ans array
    for(int i=0;i<=k;i++){
        arr[j++]=array[i];
    }

    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }

    cout<<endl;
    
    return 0;
}