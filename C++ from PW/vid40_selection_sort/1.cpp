//selection sort

// repeteadly find min element in unsorted array & place it at begining
/*
ex. 5,8,4,9,(2)

2,8,(4),9,5   // 2,5 swap
till 2(sorted)  after 8(unsorted)

2,4,8,9,(5)   //4,8 swap
till 4(sorted)  after 8(unsorted)

2,4,5,9,8   //5,8
till 5(sorted)  after 9(unsorted)


2,4,5,8,9   //9,8  swap
till 8(sorted)  after p(unsorted)
*/


//time complexity = o(n^2)
// space comp = no space 0(1)

// it is a unstable sorting algo

//
// worst case  0(n^2)
// best case  omega(n^2)

#include<iostream>
using namespace std;
void selectionSort(int *arr,int n){
    for(int i=0;i<n-1;i++){
        int min_idx=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_idx]) {min_idx=j;}
        }
 // placing min element at begi
    if(i!=min_idx){
        swap(arr[i],arr[min_idx]);
    }
    }
    

}
int main(){
    int n=5;
    int arr[n]={5,8,45,9,2};
    selectionSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    
    return 0;
}