// find the second largest element in the given array

#include<iostream>
using namespace std;

int largestelementindex(int arr[],int size){
    int max=INT8_MIN;
    int maxindex=-1;
    for(int i=0;i<6;i++){
        if(arr[i]>max){
        max=arr[i];
        maxindex=i;
    }
    }
    return max;
    

}

int main(){
    int arr[6]={};
    cout<<"Enter array: ";
    for(int i=0;i<6;i++){
        cin>>arr[i];
    }


    int indexoflargest = largestelementindex(arr,6);
    cout<<arr[indexoflargest]<<endl;

    arr[indexoflargest]=-1;
    int indexofsecondlargest = largestelementindex(arr,6);
    cout<<arr[indexofsecondlargest]<<endl;
    
    return 0;
}