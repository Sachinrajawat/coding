#include<iostream>
#include<string>
using namespace std;
class Book{

    int book_id;
    string book_name;
    float price;
    public:
    void input_Book_data(){
        cout<<"Enter Book id: "<<endl;
        cin>>book_id;
        cin.ignore();
        cout<<"Enter Book name: "<<endl;
        getline(cin,book_name);
        cout<<"Enter price: "<<endl;
        cin.ignore();
        cin>>price;
    }
    void show(){
        cout<<"\n BOOK ID : "<<book_id;
        cout<<"\n BOOK name : "<<book_name;
        cout<<"\n BOOK price : "<<price;
    }


};

class Writer{
    string writer_name;
    string address;
    int num_books;
    Book objB[5];
    public:
    void input(){
        cout<<"Writer_name: "<<endl;
        cin.ignore();
        getline(cin,writer_name);
        cout<<"ADress: "<<endl;
        cin.ignore();
        getline(cin,address);

        cout<<"No. of books : "<<endl;
        // cin.ignore();3
        cin>>num_books;
        cin.ignore();
        for(int i=0;i<5;i++){
            // cin.ignore();
            objB[i].input_Book_data();
        }
    }
    void display(){
        cout<<"writer name: "<<writer_name<<" -> Address : "<<address<<" -> num of books: "<<num_books<<endl;
        for(int i=0;i<5;i++){
            objB[i].show();
        }
    }
};

int main(){
    Writer b;
    
    b.input();
    b.display();

    return 0;
}