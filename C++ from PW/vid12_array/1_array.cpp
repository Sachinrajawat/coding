

#include<iostream>
using namespace std;
int main(){
    
    // int array[]={1,2,3,4};
    // int size = sizeof(array)/sizeof(array[0]);

    // //for loop
    // for(int i=0;i<size;i++){
    //     cout<<array[i]<<endl;
    // } 

    // // for each loop
    // for(int ele:array){
    //     cout<<ele<<endl;
    // }

    // // while loop
    // int index=0;
    // while(index<size){
    //     cout<<array[index]<<endl;
    //     index++;
    // }

/*   input in for loop

    char vowels[5];
    for(int i=0;i<5;i++){
        cin>>vowels[i];


    }

    for(int i=0;i<5;i++){
        cout<<vowels[i]<<" ";
    }*/
    char vowels[5];
    for(char &element:vowels){
        cout<<"ENtr vowels: ";
        cin>>element;
        
    }

    for(int i=0;i<5;i++){
        cout<<vowels[i]<<" ";
    }
    return 0;
}