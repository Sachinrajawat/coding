// search if a given element is present in the array or not.
// if it is not present than -1 else return the index

#include<iostream>
using namespace std;
int main(){
    int array[5];
    cout<<"Enter the array: ";
    for(int i=0;i<5;i++){
    
    cin>>array[i];
    }
    // for(int i=0;i<5;i++){
    
    // cout<<array[i];
    // }
    int num;
    cout<<"Enter the number: ";
    cin>>num;
    for(int i=0;i<5;i++){
        if(num==array[i]){
            cout<<"Number present";
            break;
        }
        else{
            return -1;
        }
        
    }


    



    return 0;
} 