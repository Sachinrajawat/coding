// write a program to display transpose of matrix entered by the user

#include<iostream>
using namespace std;
int main(){
    int r,c;
    cout<<"Enter rows ans column: ";
    cin>>r>>c;
    int mat[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            cin>>mat[i][j];
        }
    }
    int trans[c][r];
    for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            trans[i][j]=mat[j][i];
            
        }
    }
    for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            cout<<trans[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}