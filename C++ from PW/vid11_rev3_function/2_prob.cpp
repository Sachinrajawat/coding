// print the area and circumference of the circle

#include<iostream>
using namespace std;

double area(int r){
    
    return 3.14*r*r;
}
double circumference(int r){
    return 2*3.14*r;
}

int main(){
    int r;
    cout<<"Enter r: ";
    cin>>r;
    cout<<"Area is: "<<area(r)<<"\n";
    cout<<circumference(r);

    return 0;
}