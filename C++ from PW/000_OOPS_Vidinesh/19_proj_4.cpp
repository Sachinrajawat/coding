#include<iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;
class Teacher{
    string Teacher_name;
    int Teacher_age;
    string Teacher_address;
    public:
    void input_data(){
        cout<<"Enter teacher name: "<<endl;
        cin>>Teacher_name;
        cout<<"Enter age: "<<endl;
        cin>>Teacher_age;
        cout<<"Enter address "<<endl;
        cin>>Teacher_address;
    }
    void display(){
        cout<<"TEAcher name: "<<Teacher_name<<endl;
        cout<<" teacher age : "<<Teacher_age<<endl;
        cout<<"teacher address "<<Teacher_address<<endl;
    }
};

class Writer{
    string writer_name;
    string writer_address;
    int num_books;
    public:
    void input_data(){
        cout<<"Enter Writer name: "<<endl;
        cin>>writer_name;
        cout<<"Enter Writer address: "<<endl;
        cin>>writer_address;
        cout<<"Enter num of books: "<<endl;
        cin>>num_books;
    }
    void display(){
        cout<<"Writer name: "<<writer_name<<endl;
        cout<<"Writer address: "<<writer_address<<endl;
        cout<<"Writer num of books: "<<num_books<<endl;
    }
};

class Scholar:public Teacher,public Writer{
    public:
    void input_Data(){
        Teacher::input_data();
        Writer::input_data();
    }
    void display(){
        Teacher::display();
        Writer::display();
    }
};
int main(){
    Scholar Obj;
    Obj.input_Data();
    Obj.display();
    return 0;
}