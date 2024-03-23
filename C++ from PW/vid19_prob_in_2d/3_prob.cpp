// Given a sqaure matrix, turn it by 90 degrees in a clockwise direction without using any extra space

#include<iostream>
#include<vector>
using namespace std;

void rotateArray(vector<vector<int>>& v){
    int n=v.size();
    // transpose
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            swap(v[i][j],v[j][i]);
        }
    }

    // reverse every row
    for(int i=0;i<n;i++){
        reverse(v[i].begin(),v[i].end());
    }
    return;
}
int main(){
    int n;
    cout<<"Entr size of matrix: ";
    cin>>n;
    vector<vector<int>> v(n,vector<int>(n));
    for(int i=0;i<v.size();i++){
        for(int j=0;j<v.size();j++){
        cin>>v[i][j];
        }
    }
    rotateArray(v);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cout<<v[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}