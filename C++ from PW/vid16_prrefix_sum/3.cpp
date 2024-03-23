/*  Given an array of the integers of size n. Answer q queries where u need to print the sum of 
values inn a given range of indices from l to r(both included)
NOTE: The values of l and r in queries follow one-based indexing

*/

#include<iostream>
#include<vector>
using namespace std;

void sum_from_l_to_r(vector<int> &v){
    int l,r;
    cout<<"Enter l and r: ";
    cin>>l>>r;
    int sum_l=0;
    for(int i=0;i<l-1;i++){
        sum_l+=v[i];
    }
    int sum_r=0;
    for(int i=0;i<r;i++){
        sum_r+=v[i];
    }
    int final_sum=sum_r-sum_l;
    cout<<final_sum<<endl;
    return;

}

int main(){
    int n;
    cin>>n;
    vector<int> v(n+1,0);
    for(int i=1;i<=n;i++){
        cin>>v[i];
    }

    //calculate prefix sum array
    for(int i=1;i<=n;i++){
        v[i]+=v[i-1];
    }
    int q;
    cout<<"Enter num_query: ";
    cin>>q;
    while(q--){
        int l,r;
        cin>>l>>r;

        int ans=0;
        //ans = prefix sum array[r] - prefixSumArray[l-1]
        ans=v[r]-v[l-1];
        cout<<ans;
    }


    return 0;
}