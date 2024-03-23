/* //call by reference using pointers
//swap the number
#include<iostream>
using namespace std;
void swap(int *x, int *y){
    int temp=*x;
    *x=*y;
    *y=temp;
}

int main(){
    int x=10;
    int y=20;
    int *p1=&x;
    int *p2=&y;
    swap(p1,p2);
    cout<<x<<" "<<y;
    return 0;
} */

// find first and last index
#include<iostream>
using namespace std;
void findFirstAndLastIndex(string s,char ch, int *first,int *last){
for(int i=0;i<s.size();i++){
    if(s[i]==ch){
        *first=i;
        break;
    }
    
}
for(int i=s.size()-1;i>=0;i--){
    if(s[i]==ch){
        *last=i;
        break;
    }
}
}

int main(){
    string s="aaabac";
    char ch='a';
    int first=-1;
    int last=-1;
    int *pf=&first;
    int *pl=&last;
    findFirstAndLastIndex(s,ch,pf,pl);
    cout<<*pf<<" "<<*pf<<endl;
    cout<<*pl<<" "<<*pl<<endl;
    return 0;

}
