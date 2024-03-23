//DIAMOND PROBLEM

//base class has multiple parent classes having a common ancestor class
/*
            class F
          /       \
     class D     class E
     /             \
 class B         class C
       \         /
        class A
        
*/


#include<iostream>
using namespace std;
class Parent{
    public:
    Parent(){
        cout<<"Parent class"<<endl;
    }
};

class child1: public Parent{   
    public:
    child1(){
        cout<<"child1 class"<<endl;
    }
};

class child2: public Parent{   
    public:
    child2(){
        cout<<"child2 class"<<endl;
    }
};

class GrandChild: public child1,public child2{
    public:
    GrandChild(){
        cout<<"Grandchild class"<<endl;
    }
};

int main(){
    GrandChild gc;
    
    return 0;
    }
