#include<iostream>
using namespace std;

// reverse star
int main(){
    for(int i=0;i<5;i++){
        for(int j=0;j<5-i;j++){
        cout<<" ";
        }
        for(int k=0;k<i+1;k++){
cout<<"*";
        }
        
        cout<<endl;
    }
}