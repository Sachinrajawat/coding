//given two string s and t, determine if they are isomorphic
//isomorphic = one to one mappiing

// input: s="egg" ,t="add"
// output: yes
//input: s="egg" ,t="adda"
// output: no 
// input: s="egg" , t="ada"
// output: no 
#include<iostream>
#include<string>
using namespace std;
bool isIsomorphic(string s1, string s2){
    
}
int main(){


    string s1,s2;
    cout<<"enter 2 string: ";
    cin>>s1>>s2;
    if(isIsomorphic(s1,s2) == true){
        cout<<"String are isomorphic"<<endl;
    }
    else{
        cout<<"string are not anagram"<<endl;
    }
    return 0;
}