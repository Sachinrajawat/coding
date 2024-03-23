#include<iostream>
using namespace std;
struct employee
{
    /* data */
    int Eid;
    char favChar;
    float salary;

};

union money{
    int rice;
    char car;
    float ponds;
    
};
int main(){
    struct employee sachin;
    sachin.Eid=1;
    sachin.favChar = 'C';
    sachin.salary=12333;
    cout<<sachin.salary<<endl;
    cout<<sachin.Eid<<endl;

    return 0;
}