


#include<iostream>
using namespace std;

class Node{
    public:
    int val;
    Node* next;
    Node(int data){
        val=data;
        next=NULL;
    }
};
class LinkedList{
    public:
    Node* head;
    LinkedList(){
        head=NULL;
    }
    void insertAtEnd(int value){
        Node* new_node= new Node(value);
        if(head==NULL){
            head=new_node;
            return;
        }
        Node* temp=head;
        while(temp->next!=NULL){
            temp=temp->next;

        }
        temp->next=new_node;

    }

    void display(){
        Node* temp=head;
        while(temp!=NULL){
            cout<<temp->val<<"->";
            temp=temp->next;
        }
        cout<<"NULL"<<endl;

    }
    
};

int main(){
    LinkedList l1;
    l1.insertAtEnd(1);
    l1.insertAtEnd(1);
    l1.insertAtEnd(56);
    l1.insertAtEnd(3);
    l1.insertAtEnd(5);
    l1.insertAtEnd(5);
    l1.display();
    
    return 0;
    }

