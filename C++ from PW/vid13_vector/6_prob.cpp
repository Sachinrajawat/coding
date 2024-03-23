// check if the given array is sorted or not
// means order in ascending order

#include<iostream>
#include<vector>
using namespace std;
int main(){
    
    int arr[]={1,2,3,3,5,6};
    bool sortedflag =  true;
    for(int i=0;i<6;i++){
        if(arr[i]<=arr[i-1]){
            sortedflag=false;
        }
    }
    cout<<sortedflag<<endl;
    
    return 0;
}