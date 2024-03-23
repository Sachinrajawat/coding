// find the first occurence of a given element x, given that the given array is sorted.
//if no occurrence of x is found then return -1.
#include<iostream>
using namespace std;
int occurrence(int arr[],int x,int lo,int hi){
    int mid = lo + (hi-lo)/2;
    if(lo>hi) return -1;
    // calc midpoint for the search space
    
    if(arr[mid]==x){
        int ans = mid;
        lo=mid-1;
        return ans;
    }
    if(arr[mid]<x){
        return occurrence(arr,x,mid+1,hi);
    }
    if(arr[mid]>x){
        return occurrence(arr,x,lo,mid-1);
    }

}
int main(){
    int n=10;
    int lo=0;
    int hi=n-1;
    int x=6;
    int arr[n]={2,5,5,5,6,6,8,9,9,9};
    cout<<occurrence(arr,x,lo,hi);
    
}