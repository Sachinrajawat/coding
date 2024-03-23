//wap to print the day based on the day number

#include<iostream>
using namespace std;
int main(){
    
    int num;
    cout<<"Enter a day num: ";
    cin>>num;
    switch (num)
    {
    case 1:
        cout<<"monday";
        break;
    case 2:
        cout<<"tuesday";
        break;
    case 3:
        cout<<"wednesday";
        break;
    case 4:
        cout<<"thursday";
        break;
    case 5:
        cout<<"friday";
        break;
    case 6:
        cout<<"saturday";
        break;
    case 7:
        cout<<"sunday";
        break;
    default:
        cout<<"Wrong input";
        break;
    }


    return 0;
}