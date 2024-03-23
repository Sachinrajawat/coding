// find the difference b/w the sum of elements at even indices to the sum of elements at odd indices

#include<iostream>
using namespace std;
int main(){
    int arr[6];
    cout<<"Enter array: ";
    for(int i=0;i<6;i++){
        cin>>arr[i];
    }
    
    int ans_sum=0;

    for(int i=0;i<6;i++){
        if(i%2==0){
            ans_sum+=arr[i];
        }
        else{
            ans_sum-=arr[i];
        }
    }
    cout<<"answer is: "<<ans_sum;
    
    return 0;
}