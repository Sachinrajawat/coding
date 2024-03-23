//parameterised constructor

#include<iostream>
using namespace std;
class person{
    private:
    string name;
    int age;
    float height;
    public:
    person(){ //constructor
        name = "null";   //these are the default value
        age=0;
        height=0.0f;
    }

    person(string name_a,int age_a,float height_a){   // parameterized consturctor
        name=name_a;
        age=age_a;
        height=height_a;
    }
    void getdata(){
        cout<<endl<<"Name "<<name;
        cout<<endl<<"Age "<<age;
        cout<<endl<<"Height "<<height;

    }
};

int main(){
        person obj("Sachin",20,5.10);
        obj.getdata();
    }