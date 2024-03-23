/*Find the total number of pairs in the array whose sum is equal to the given value x */

#include<iostream>
using namespace std;
int main(){
    int arr[6]={};
    cout<<"Enter array: ";
    
    for(int i=0;i<6;i++){
        cin>>arr[i];
    }
    int x;
    cout<<"Enter x: ";
    cin>>x;
    int pairs_count=0;
    int sum=0;
    for(int i=0;i<6;i++){
        
        for(int j=i+1;j<6;j++){
            if(arr[i]+arr[j]==x){
                pairs_count++;
            }
        }
        
    }
    cout<<pairs_count;
    
    return 0;
}