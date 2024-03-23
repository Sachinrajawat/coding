/*
//DESTRUCTOR = when obj is deleted
->cannot pass any parameters
->name -> ~(class name)

*/



#include<iostream>
using namespace std;
class Rectangle{
    public:
    int l;
    int b;

    Rectangle(){   //default constructor - no args passsed
        l=0;
        b=0;
    }

    Rectangle(int x,int y){  //PArameterised constructor - args pass
        l=x;
        b=y;
    }
    Rectangle(Rectangle& r){  //copy constr. - intialise an obj by  anothr existing object
    l = r.l;
    b= r.b;
    }

    ~Rectangle(){  // Destructor
        cout<<"Destrutor is called"<<endl;
    }

};

int main(){
    Rectangle r1;
    cout<<r1.l<<" "<<r1.b<<endl;

    Rectangle r2(3,4);
    cout<<r2.l<<" "<<r2.b<<endl;

    Rectangle r3 = r2;
    cout<<r3.l<<" "<<r3.b<<endl;
    return 0;
}