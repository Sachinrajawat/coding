#include<iostream>
#include<string>

using namespace std;
class A{
    private:
    int weight;
    public:
    A(int x=0){
        weight=x;
    }

    void printvalue(){
        cout<<"weight is "<<weight<<endl;
    }

    A operator+(A w){
        A temp;
        temp.weight=weight + w.weight;
        return temp;
    }
};
int main(){
    int a=34,b=45,c=0;
    c=a+b;

    cout<<"Total: "<<c;

    //operator overloading
    A person1(89);
    A person2(49);
    A total;

    total=person1+person2;
    total.printvalue();
    return 0;
}