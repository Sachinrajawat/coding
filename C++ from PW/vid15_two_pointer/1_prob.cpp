// sort an arrray consisting of only 0s and 1s

/*#include<iostream>
using namespace std;
int main(){
    
    int arr[8]={1,1,0,0,1,0,1,0};
    int count=0;
    for(int i=0;i<8;i++){
        if(arr[i]==0){
            count++;
        }
    }
    for(int i=0;i<8;i++){
        if(i<count){
            arr[i]=0;
        }
        else{
            arr[i]=1;
        }
    }
    for(int i=0;i<8;i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}*/



// by using two pointer 



#include<iostream>
#include<vector>
using namespace std;

void sortZeroesAndOnes(vector<int> &v){
    int left_ptr=0;
    int right_ptr=v.size()-1;

    while(left_ptr<right_ptr){
        if(v[left_ptr]==1 && v[right_ptr]==0){
            v[left_ptr++]==0;
            v[right_ptr--]==1;
        }

        if(v[left_ptr]==0){
            left_ptr++;

        }
        if(v[right_ptr]==1){
            right_ptr--;
        }

    }
    return;
}


int main(){
        int n;
        cout<<"Enter: ";
        cin>>n;

        vector<int> v;

        for(int i=0;i<n;i++){
            int ele;cin>>ele;
            v.push_back(ele);
        }
        sortZeroesAndOnes(v);

        for(int i=0;i<n;i++){
            cout<<v[i]<<" ";
        }
        cout<<endl;

    return 0;
}