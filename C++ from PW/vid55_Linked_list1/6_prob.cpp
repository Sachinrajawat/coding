//given the head of singly linked list and print the reverse

#include<iostream>
using namespace std;

class Node{
    public:
    int val;
    Node* next;
    Node(int data){
        val = data;
        next = NULL;
    }
};

class LinkedList{
    public:
    Node* head;
    LinkedList(){
        head=NULL;
    }
    void insertAtEnd(int value){
        
        Node* new_node = new Node(value);
        if(head==NULL){
            head=new_node;
            return;
        }
        Node* temp = head;
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

    void reverse(Node* head){
    
    //base case
    if(head==NULL){return;}
    // recursive case
    reverse(head->next);
    cout<<head->val<<" ";

    }
};
int main(){
    LinkedList l;
    l.insertAtEnd(1);
    l.insertAtEnd(2);
    l.insertAtEnd(3);
    l.insertAtEnd(4);
    l.insertAtEnd(5);
    l.display();
    l.reverse(l.head);
    
    return 0;
}