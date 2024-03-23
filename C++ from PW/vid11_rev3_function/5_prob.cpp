/*print all the prime number
*/

#include<iostream>
using namespace std;
    bool prime(int num){
        for(int i=2;i<=(num-1);i++){
            if(num%i==0){
                return false;
            }
            
        }
        return true;
        
    }

int main(){
    int a,b;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"Enter b: ";
    cin>>b;
    for(int i=a;i<=b;i++){
        if(prime(i)){
            cout<<i<<" ";
        }
        
    }


    return 0;
}