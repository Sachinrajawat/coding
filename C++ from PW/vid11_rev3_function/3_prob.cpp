// given the of a person, write a function to check of the person is eligiblr to vote or not

#include<iostream>
using namespace std;

int vote(int age){
    if(age>=18){
        return true;
    }
    else{
        return false;
    }
    
}
int main(){
    int age;
    cout<<"Enter age: ";
    cin>>age;
    cout<<vote(age)<<endl;


    return 0;
}