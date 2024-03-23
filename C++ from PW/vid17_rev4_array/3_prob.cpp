/* given a vector arr[] sorted in increasing order of n size and ana integer x,
find if there exist a pair in the array whose absolute difference is exactly x.

*/

#include<iostream>
using namespace std;
int main(){
    int arr[]={1,2,3,4,5,6,7};
    int x;
    cout<<"Enter x: ";
    cin>>x;
    int i=0,j=1;
    bool found=false;
    while(i<=6 and j<=6){
        if(abs(arr[i]-arr[j])==x){
            found=true;
            break;
        }
        else if(abs(arr[i]-arr[j])<x){
            j++;
        }
        else{
            i++;
        }
    }
if(found==true) cout<<"YES";
else cout<<"NO";

    
    
    return 0;
}