// given a string str, sort thr given string.
// constraints: the string will contain only alphabetical characters from a-z.

#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main(){
    string str;
    cout<<"Enter the string: ";
    cin>>str;
    for(int i=0;i<str.size()-1;i++){
        for(int j=0;j<str.size()-i-1;j++){
        int a = int(str[j]);
        int b =int(str[j+1]);
        if(a>b){
            swap(str[j],str[j+1]);
        }}
    }
    cout<<str<<endl;

}