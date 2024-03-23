
#include<iostream>
using namespace std;
class person{
    private:
    string name;
    int age;
    float height;
    public:
    
    person(string name_a="Null",int age_a=0,float height_a=0.0f){   // parameterized consturctor
        name=name_a;
        age=age_a;
        height=height_a;
    }
    person(person &obj){// copy constructor
        name=obj.name;
        age=obj.age;
        height=obj.height;
    }
    void getdata(){
        cout<<endl<<"Name "<<name;
        cout<<endl<<"Age "<<age;
        cout<<endl<<"Height "<<height;

    }
};

int main(){
        person obj("Sachin",20,5.10),obj2(obj);
        obj.getdata();
        obj2.getdata();
    }