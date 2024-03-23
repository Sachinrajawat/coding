// find the square root of the given non negative value x. Round it off to the nearest floor integer value
// input: x=4 output:2
// input: x=11 output: 3
#include<iostream>
using namespace std;
int squareRoot(int x){
    int lo=1,hi=x;
    int ans=-1;
    while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        if(mid *mid <x){
            ans = mid;
            lo = mid + 1; 
        }
        else{
            hi = mid-1;
        }
        
    }
    return ans;
    }
int main(){
    int x;
    cout<<"Enter x: ";
    cin>>x;
    cout<<squareRoot(x);
    return 0;
}