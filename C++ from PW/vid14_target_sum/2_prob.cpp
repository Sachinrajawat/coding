/*count the number of triplets whose sum is equal to the given value x
*/

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

    int count=0;
    int sum=0;
    for(int i=0;i<6;i++){
        for(int j=i+1;j<6;j++){
            for(int k=j+1;k<6;k++){
                if(arr[i]+arr[j]+arr[k]==x){
                    count++;
                }
            }
        }
    }
    cout<<"count is: "<<count;
    
    return 0;
}