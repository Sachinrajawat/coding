//BINARY SEARCH
//TIME CMPLXTY = O(LOG(N))
//SPACE COMPLXTTY= O(1)

#include<iostream>
using namespace std;
int binarySearch(int arr[],int n,int target){
    //define search space
    int lo = 0; // start of the search space
    int hi=n-1; //end of the search space
    while(lo<=hi){
        // calc midpoint for the search space
        int mid = (lo+hi)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            //discard the left of the mid
            lo= mid+1;
        }
        else{
            //discard the right of the mid
            hi= mid - 1;
        }
    }
    return -1;
}
int main(){
    int n=8;
    int target=15;
    int arr[8]={2,4,5,7,15,24,45,50};
    cout<<binarySearch(arr,n,target)<<endl;;
    return 0;
}