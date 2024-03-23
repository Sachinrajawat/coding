// write a program to take input from user for cost Price(C.P.) and Selling Price(S.P) and calculate Profit or loss 

#include<iostream>
using namespace std;
int main(){
    int CP,SP;
    cout<<"Enter C.P: "<<endl;
    cin>>CP;
    cout<<"Enter S.P: ";
    cin>>SP;
    if(SP>CP){
        int profit = SP-CP;
        cout<<"Your Profit is: "<<profit<<endl;
    }
    else if(CP>SP){
        int loss =CP-SP;
    cout<<"Your Loss is: "<<loss<<endl;
    }
    else{
        cout<<"no profit no loss";
    }
    return 0;
}