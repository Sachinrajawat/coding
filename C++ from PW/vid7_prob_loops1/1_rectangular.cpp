/* RECTANGULAR PATTERN
******
******
******
*/


#include<iostream>
using namespace std;
int main(){
    
    int a;
    cout<<"Enter a: ";
    cin>>a;
    int b;
    cout<<"Enter b: ";
    cin>>b;
    for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
            cout<<"*";
        }
        cout<<endl;
    }


    return 0;
}