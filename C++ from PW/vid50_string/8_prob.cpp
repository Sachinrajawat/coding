// check whether a string is a valid shuffle of two string or not

#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
bool valid_suffle(string s1,string s2,string res){
    if(res.size()!=s1.size()+s2.size()){
        return false;
    }
    string s3=s1+s2;
    sort(s3.begin(),s3.end());
    sort(res.begin(),res.end());
    for(int i=0;i<res.size();i++){
        if(res[i]!=s3[i]){
            return false;
        }
    }
    return true;
}

int main(){
    string s1,s2,res;
    cout<<"Enter first string: ";
    getline(cin,s1);
    cout<<"Enter 2nd string: ";
    getline(cin,s2);
    cout<<"Enter resultant string: ";
    getline(cin,res);
    if(valid_suffle(s1,s2,res)==true){
        cout<<"resultant string is valid shuffle of two string ";
    }
    else{
        cout<<"resultant string is not a valid shuffle of two string ";
    }
}