//area of shape
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
class shape{
    protected:
    double x;
    double y;
    public:
    virtual void get_data()=0;
    virtual void display_area()=0;


};
class circle : public shape{
    public:
    void get_data(){
        cout<<"Enter radius of circle: ";
        cin>>x;
    }
    void display_area(){
        double area = 3.14*x*x;
        cout<<"Area of circle is: "<<fixed<<setprecision(2)<<area<<endl;
    }
};
class rectangle: public shape{
    void get_data(){
        cout<<"Enter length of rectangle: ";
        cin>>x;
        cout<<"Enter breadth of rectangle: ";
        cin>>y;
    }
    void display_area(){
        double area = x*y;
        cout<<"Area of rectangle is: "<<area<<endl;
    }

};
class triangle:public shape{
    void get_data(){
        cout<<"Enter base of triangle: ";
        cin>>x;
        cout<<"Enter height of triangle: ";
        cin>>y;
    }
    void display_area(){
        double area = (x*y)/2;
        cout<<"Area of triangle is: "<<area<<endl;
    }
};
class square:public shape{
    void get_data(){
        cout<<"Enter side length of sqaure: ";
        cin>>x;
        
    }
    void display_area(){
        double area = x*x;
        cout<<"Area of sqaure is: "<<area;
    }
};

int main(){
    circle c;
    rectangle r;
    triangle t;
    square s;
    shape *sh[4];
    int choice;
    cout<<"Enter choice b/w 1 to 4: "<<endl;
    cin>>choice;
    switch(choice){
        case 1:
        sh[0]=&c;
        sh[0]->get_data();
        sh[0]->display_area();
        break;
        case 2:
        sh[1]=&r;
        sh[1]->get_data();
        sh[1]->display_area();
        break;
        case 3:
        sh[2]=&t;
        sh[2]->get_data();
        sh[2]->display_area();
        break;
        case 4:
        sh[3]=&s;
        sh[3]->get_data();
        sh[3]->display_area();
        break;
        default:
        cout<<"INVALID";
        
    }
    
    


}