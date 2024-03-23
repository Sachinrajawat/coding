//BINARY SERACH RECURSIVELY

// time complxty = O(logn)
// space complxty = O(n)

/*
mid = (lo + hi)/2   // for high value of li & ho it is go too much high
mid = lo + (hi-lo)/2   //take this


*/




#include<iostream>
using namespace std;
int f(int arr[],int target,int lo,int hi){
    if(lo>hi) return -1;
    // calc midpoint for the search space
    int mid = (lo+hi)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(arr[mid]<target){
        return f(arr,target,mid+1,hi);
    }
    else{
        //discard the right of the mid
        hi= mid - 1;
        return f(arr,target,lo,mid-1);
        }
}
int main(){
    int n=8;
    int lo = 0; // start of the search space
    int hi=n-1; //end of the search space
    int target=15;
    int arr[8]={2,4,5,7,15,24,45,50};
    cout<<f(arr,target,lo,hi)<<endl;;
    return 0;
} 