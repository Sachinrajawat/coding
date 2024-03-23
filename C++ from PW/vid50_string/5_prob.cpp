//given two string s and t, return true if t is an anagram of s, and false otherwise.
// constraints:  string s and t will only contain lowercase alphabetical characters

// anagram =  rearranging letters of a word to get another word

#include<iostream>
#include<string>
#include<vector>
using namespace std;
bool isAnagram(string s1,string s2){
    //create a frequency array
    vector<int> freq(26,0);

    //if length are different for s1 amd s2 toh return false
    if(s1.length()!=s2.length()){
        return false;
    }
    //store frequency of
    for(int i=0;i<s1.length();i++){
        freq[s1[i]-'a']++; // for s1,we are incrementing freq of char
        freq[s2[i]-'a']--; // for s2, we are decrementing freq of char
    }
    //cheacking if freq of every character is 0 
    for(int i=0;i<26;i++){
        if(freq[i]!=0){ // not anagram
    return false;
        }
    }
return true;
}
int main(){


    string s1,s2;
    cout<<"enter 2 string: ";
    cin>>s1>>s2;
    if(isAnagram(s1,s2) == true){
        cout<<"String are anagram"<<endl;
    }
    else{
        cout<<"string are not anagram"<<endl;
    }
    return 0;
}