//str = COLLEGE\0   LAST ME NULL CHARACTER HOTA H 


#include<iostream>
#include<string>
using namespace std;
int main(){
    string str = "college";
    string str1("wallah");
    cout<<str<<" "<<str1<<endl;
    string str2;
    cout<<"Enter string : "<<endl;
    cin>>str2;
    
    cout<<str2;  // only first word type hoga
    string str3;
    getline(cin,str3);
    cout<<"\n enter string 2: ";
    cout<<str3<<endl;   
    return 0;
}