//given a boolean 2d array, where each row is sorted. gind
// the row with the maximum num of 1s

#include<iostream>
#include<vector>
using namespace std;

/*int maximumOnesRows(vector<vector<int>>&v){
    int maxOnes=INT16_MIN;
    int maxOnesRows=-1;
    int column=v[0].size();
    for (int  i = 0; i < v.size(); i++)
    {
        for(int j=0;j<v[i].size();j++){
            if(v[i][j]==1){
                int numberOfOnes=column-j;
                if(numberOfOnes>maxOnes){
                    maxOnes=numberOfOnes;
                    maxOnesRows=i;                }
            }
            break;
        }
    }
    return maxOnesRows;
}
int main(){
    int r,c;
    cin>>r>>c;
    vector<vector<int>> vec(r,vector<int>(c));
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            cin>>vec[i][j];
        }
    }
    int res= maximumOnesRows(vec);
    cout<<res<<endl;

    return 0;
}*/

int leftMostOneRow(vector<vector<int>&v){
    int leftMostOne=-1;
    int maxOnesRow=-1;
    int j=v[0].size()-1;

    //finding leftmost one in 0th row
    while(j>=0 && v[0][j]==1){
        j--;
        leftMostOne=j;
        maxOnesRow=0;
        j--;
    }

    //check in the rest of the rows if we can find a one left to theMostOne
    for(int i=1;i<v.size();i++){
        while(j>=0 && v[i][j]==1){
            leftMostOne=j;
            j--;
            maxOnesRow=i;
        }
    }
    return maxOnesRow;
}
int main(){
    int r,c;
    cin>>r>>c;
    vector<vector<int>> vec(r,vector<int>(c));
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            cin>>vec[i][j];
        }
    }
    int res= leftMostOneRow(vec);
    cout<<res<<endl;

    return 0;
}