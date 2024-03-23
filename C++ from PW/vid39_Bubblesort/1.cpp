// bubble sort algorithm

//repeatedly swap two adjacent elements if in the wrong orderunit array is sorted

/*
ex:   20,[50,40],10,30

1st pass
20,40,[50,10],30
20,40,10,[50,30]
20,[40,10],30,50

2nd pass
20,10,[40,30],50
[20,10],30,40,50

3rd pass
10,20,30,40,50

4th pass
10,20,30,40,50

for n element we need n-1 passes
*/

#include<iostream>
using namespace std;

void bubbleSort(int *arr,int n){

    for(int i=0;i<n-1;i++){
        bool flag = false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                flag=true;
                swap(arr[j],arr[j+1]);}
            
        }
        if(!flag) break;
    }
    return;
}

int main(){
    int n=5;
    int arr[n]={1,2,3,4,5};
    bubbleSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}




