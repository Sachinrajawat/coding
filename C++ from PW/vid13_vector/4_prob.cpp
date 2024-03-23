// count the num. of occurrence of a particular element x;

#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> v(6);
    cout<<"Enter vector: ";
    for(int i=0;i<6;i++){
        cin>>v[i];

    }
    int x;
    cout<<"Enter x: ";
    cin>>x;
    int no_of_occu=0;
    for(int ele:v){
        if(ele==x){
            no_of_occu++;
        }
    }
    cout<<no_of_occu;
    
    return 0;
}