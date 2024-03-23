#include<iostream>
#include<string>
using namespace std;
class Bank{
    string dep_name;
    string acc_name;
    int balance;
    public:
    Bank(){
        cout<<"Enter name: ";
        getline(cin,dep_name);
        cout<<"Enter acc_type: ";
        getline(cin,acc_name);
        this->balance=5000;
    }
    void deposit(int money){
        balance=balance+money;
        cout<<"Balance after deposit : "<<endl;
    }
    void withdraw(int money){
        if(balance>=money){
            balance=balance-money;
            cout<<"Balance after withdraw";
            
        }
        else{
            cout<<"Withdraw amount must be less than balance amount";
        }
    }
    void display(){
        cout<<"----------------Account Detail---------------"<<endl;
        cout<<"Name: "<<dep_name<<endl;
        cout<<"acc_type: "<<acc_name<<endl;

        cout<<"balance amount: "<<balance<<endl;
    }
};
int main(){
    int choice;
    Bank b;
    do{
        cout<<"---------MAIN MENU----------"<<endl;
    cout<<"Enter 1 for deposit"<<endl;
    cout<<"Enter 2 for withdraw"<<endl;
    cout<<"Enter 3 for display"<<endl;
    cout<<"Enter 4 for EXIT"<<endl;
    cout<<"Enter any choice: ";
    cin>>choice;
    switch(choice){
        case 1:
        int x;
        cout<<"Enter amount for deposit: ";
        cin>>x;
        b.deposit(x);
        break;
        case 2:
        // int x;
        cout<<"Enter amount for withdraw: ";
        cin>>x;
        b.withdraw(x);
        break;
        case 3:
        b.display();
        break;
        case 4:
        exit(1);
        default:
        cout<<"Invalid";
    }

    }
    while(1);
    
    return 0;
}