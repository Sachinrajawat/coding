#include<iostream>
#include<string>
#include<algorithm>
using namespace std;


//cheack wheather one string is rotation of another string
bool rotation(string s1,string s2){
    if(s1.length()!=s2.length()){
        return false;
    }
    else{
        int i=0;
        int j=s2.size()-1;
        while(s1[i]==s2[j] && i<s1.size()){
            i++;
            j--;
        }
        if(i==s1.size()){
            return true;
        }
        else{
        return false;}
    }
}
int main(){
    string s1,s2;
    cout<<"Enter first string: ";
    getline(cin,s1);
    cout<<"Enter 2nd string: ";
    getline(cin,s2);
    if(rotation(s1,s2)==true){
        cout<<"S2 is rotation of s1";
    }
    else{
        cout<<"s2 is not a rotation of s1";
    }
}