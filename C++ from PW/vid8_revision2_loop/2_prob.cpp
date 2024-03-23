/*
for n=5

  *  
  *
***** 
  * 
  * 

*/

#include<iostream>
using namespace std;
int main(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=5;j++){
            if(i==3){
                cout<<"*";
            }
            else{
                if(j==3){
                    cout<<"*";
                }
                else{
                    cout<<" ";
                }
            }
        }
        cout<<endl;
    }


    return 0;
}