//pointer airthmetic

#include<iostream>
using namespace std;
int main(){
    int x=20;
    double dec=9.9;
    double *ptrd = &dec;

    int *ptr=&x;
    cout<<"size of x(int) is: "<<sizeof(x)<<endl;
    cout<<"size of dec(double) is: "<<sizeof(dec)<<endl;

    cout<<ptr<<" "<<ptr+1<<endl;// 4 add ho rha h 
    cout<<ptrd<<" "<<ptrd+1<<" "<<ptrd+2<<" "<<ptrd+3<<" "<<ptrd-1<<endl;// 8 add ho rha h
    
}