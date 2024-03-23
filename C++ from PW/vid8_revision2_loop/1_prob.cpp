/*
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
*/

#include<iostream>
using namespace std;
int main(){
    int n=5;
    
    for(int i=1;i<=n;i++){
        int no_of_chars=2*i -1;
        for(int j=1;j<=(n-i);j++){
            cout<<" ";
        }
        for(int j=0;j<no_of_chars;j++){
            char ch = (char)('A' + j);
            cout<<ch;
        }
    }
    for(int i=n+1;i<=(2*n-1);i++){
        for(int j=1;j<=(i-n);j++){
            cout<<" ";
        }
        int no_of_char=(2*(2*n-i)-1);
        for(int j=0;j<no_of_char;j++){
            char ch = (char)('A' + j);
            cout<<ch;
        }
    cout<<endl;
    }


    return 0;
}