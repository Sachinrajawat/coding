
// find the max value in all the array
#include<iostream>
using namespace std;
int main(){

    int array[5]={1,2,25,2,29};
    int max=0;
    for(int i=0;i<5;i++){
        if(array[i]>max){
            max=array[i];
        }
        
    }
    cout<<max<<endl;


    return 0;
} 