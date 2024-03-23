//write a program that count the number of objects created of  particular class
#include<iostream>
using namespace std;
class abc{
    static int count;
    public:
    abc(){
        count++;
    }
    void showObject(){
        cout<<"Total obj is : "<<count<<endl;
    }
    
};
int abc::count=0;
int main(){
    abc a;
    a.showObject();
    abc b;
    b.showObject();
    return 0;
}