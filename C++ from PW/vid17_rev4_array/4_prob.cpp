/* Given a vector arr[] sorted in increasing order. return an array of squares of
each number sorted in increasing order. where size of vector 1 <size<101.

*/

#include<iostream>
using namespace std;
int main(){
    int arr[]={-4,-3,4,5,6,7};
    int n=6;
    int i=0,j=n-1,k=n-1;
    int result[n];
    
    while(i<=j && k>=0){
        if(abs(arr[i])>abs(arr[j])){
            result[k]=arr[i]*arr[i];
            i++;
            k--;
        }
        else{
            result[k] = arr[j]*arr[j];
            j--;
            k--;
        }
    }
    for(int i=0;i<n;i++){
        cout<<result[i]<<" ";
    }
    return 0;
}