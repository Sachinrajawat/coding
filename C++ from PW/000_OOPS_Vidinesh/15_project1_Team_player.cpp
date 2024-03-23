#include<iostream>
#include<string>

using namespace std;
class player{
    string name;
    int age;
    string team_name;
    public:
    player(string name="NULL",int age=0,string team_name ="NULL"){
        this->name=name;
        this->age=age;
        this->team_name=team_name;
    }
    void input_data(){
        cout<<"Enter name: "<<endl;
        // cin.ignore();
        getline(cin,name);
        cout<<"Enter age: "<<endl;
        cin>>age;
        cin.ignore();
        cout<<"Enter team name: "<<endl;
        getline(cin,team_name);
    }
   /*  void change_data(string n,int ag,string t){
        this->name=n;
        this->age=ag;
        this->team_name=t;
        
    } */
    void change_data(){

    }
    void display(){
        cout<<"Name : "<<name<<" age : "<<age<<" team_name : "<<team_name<<endl;

    }
};

int main(){
    int choice;

    player p;
    do{
        cout<<"1 for input"<<endl;
        cout<<"2 for output"<<endl;
        cout<<"3 for change"<<endl;
        cout<<"4 for exit"<<endl;
        cin>>choice;
        switch (choice)
        {
        case 1:
            cin.ignore();
            p.input_data();
            break;
        case 2:
            p.display();
            break;
        case 3:
            // p.change_data("dd",40,"jj");
            p.change_data();
            
            break;
        case 4:
            exit(1);
            break;
        
        default:
        cout<<"invalid";
            break; 
        }
    }
    while(1);
    
    return 0;
}