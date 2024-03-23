#include<iostream>
#include<string>
// non parametrized constructor
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
    void getdata(){
        cout<<endl<<"Name "<<name;
        cout<<endl<<"Age "<<age;
        cout<<endl<<"Height "<<height;

    }
};

int main(){
        person obj;
        obj.getdata();
    }