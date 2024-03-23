#include<iostream>
using namespace std;
class house{
    private:
    int length=0,breadth=0;   //member variable
    public:
    void setData(int x,int y){   //member function
        length=x;
        breadth=y;
    }
    void area(){
        cout<<"Area is: "<<length*breadth;
    }

};
int main(){
    house h; // memory allocation
    h.setData(5,4);
    h.area();
}