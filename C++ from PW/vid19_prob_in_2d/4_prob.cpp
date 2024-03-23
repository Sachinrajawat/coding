//given an n*m matrix 'a', return all elements of the matrix in spiral order

#include<iostream>
#include<vector>
using namespace std;
void spiralOrder(vector<vector<int> >& matrix){
    int left=0;
    int right=matrix[0].size()-1;
    int top=0;
    int bottom=matrix.size()-1;

    int directon=0;
    while(left<=right && top<=bottom){
        // left to right
        if(directon==0){
            for(int col=left;col<=right;col++){
                cout<<matrix[top][col]<<" ";
            }
            top++;
        }
        //top to bottom
        else if(directon==1){
            for(int row=top;row<=bottom;row++){
                cout<<matrix[row][right]<<" ";
            }
            right--;
        }
        //right to left
        else if(directon==2){
            for(int col=right;col>=left;col--){
                cout<<matrix[bottom][col]<<" ";
            }
            bottom--;
        }
        //bottom to top
        else{
            for(int row=bottom;row>=top;row--){
                cout<<matrix[row][left]<<" ";
            }
            left++;
        }
        directon=(directon+1)%4;
    }
}

int main(){
    int n,m;
    cout<<"Enter rows and column: ";
    cin>>n>>m;
    vector<vector<int>> matrix(n, vector<int>(m));
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>matrix[i][j];
        }
    }
    spiralOrder(matrix);

    return 0;
}