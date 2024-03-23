// write a program to display multiplication of two matrices entered by the user


#include<iostream>
using namespace std;
int main(){
    int a[4][4],b[4][4],c[4][4];
    cout<<"Enter first 4*3 matrix: "<<endl;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            cin>>a[i][j];
        }
    }
    cout<<"Enter first 3*4 matrix: "<<endl;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            cin>>b[i][j];
        }
    }
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            int value=0;
            for(int k=0;k<4;k++){
                value+=a[i][k]*b[k][j];
            }
            c[i][j]=value;
        }
    }    
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            cout<<c[i][j]<<" ";
        }
        cout<<endl;
    }
    
    
    return 0;
}