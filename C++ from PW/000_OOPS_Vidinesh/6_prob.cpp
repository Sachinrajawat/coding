/*
write a program, take phone details as input and store them in object & use constructors
Phone Details:-
1.Name
2.RAM
3.Processor
4.Battery

*/
#include<iostream>
#include<string>

using namespace std;
class mobile{
    private:
    string name;
    int RAM;
    string processor;
    int battery;

public:
mobile(string name_a="Null", int RAM_a=0, string processor_a="null", int battery_a=0)
{
    name=name_a;
    RAM=RAM_a;
    processor=processor_a;
    battery=battery_a;
}

mobile(mobile &mob){
    name=mob.name;
    RAM=mob.RAM;
    processor=mob.processor;
    battery=mob.battery;
}

void getMobileData();
};

void mobile::getMobileData(){
    cout<<"name: "<<name<<endl;
    cout<<"Ram: "<<RAM<<endl;
    cout<<"processor: "<<processor<<endl;
    cout<<"battery: "<<battery<<endl;
}
int main(){
    mobile doko;
    mobile doko2("Doko123",4,"snapdragon",4000);
    mobile doko3(doko2);
    doko.getMobileData();
    doko2.getMobileData();
    doko3.getMobileData();

    return 0;
}