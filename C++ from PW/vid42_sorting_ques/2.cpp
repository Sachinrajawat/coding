//given an array name of fruit; you are supposed to sort it in lexicographical order using the selection sort
// input:  papaya,lime,watermelon,apple,mango,kiwi
// output:  apple kiwi mango papaya watermelon


// strcmp(arr1,arr2)   //for comparing 2 string
// if it return 
// 0 then equal
// >0 arr1>arr2
// <0 arr1<arr2

//strcpy   //for copy string
#include<iostream>
#include<cstring>
using namespace std;
void selectionSort(char fruit[][60],int n){
    for(int i=0;i<n-1;i++){
        //finding the min element
        int min_index=i;
        for(int j=i+1;j<n;j++){
            if(strcmp(fruit[min_index],fruit[j]) > 0){
                min_index=j;
            }
            
        }
        //place the min element at the beginning
        if(i!=min_index){
            swap(fruit[i],fruit[min_index]);
            
        }
    }
    return;
}
int main(){
    
    char fruit[][60]={"papaya","lime","watermelon","apple","mango","kiwi"};
    int n= sizeof(fruit)/sizeof(fruit[0]);
    selectionSort(fruit,n);
    for(int i=0;i<n;i++){
        cout<<fruit[i]<<" ";
    }cout<<endl;
    return 0;
}