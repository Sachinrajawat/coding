/*
given an int array arr, move all 0'sto the end of it while maintaining the relative order of the non-zero elements

0 5 0 3 42
5 3 42 0 0
*/
//time complexity = 0(n^2)
//space complexity = 0(1)
#include<iostream>
using namespace std;
void sorting(int *arr,int n){
for(int i=0;i<n;i++){
    for(int j=1;j<n-i;j++){
        if(arr[j-1]==0){
            swap(arr[j],arr[j-1]);
        }
        }
}
}
int main(){
    int n=5;
    int arr[n]={5,89,0,0,42};
    sorting(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}