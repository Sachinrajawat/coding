// print the 1st n factorial number

#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter n: ";
    cin>>n;
    int fac=1;
    for(int i=1;i<=n;i++){
        fac*=i;
        cout<<fac<<endl;

    }


    return 0;
}