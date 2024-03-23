/* given two num a and b, write a program using functionto print all the odd number
*/

#include<iostream>
using namespace std;
bool odd(int num){
    if(num % 2==0){
        return false;
    }
    else{
        return true;
    }
}
int main(){
    int a=1,b=10;
    for(int i=a;i<=b;i++){
        if(odd(i)){
            cout<<i<<" ";
        }
        
    }
    return 0;
}