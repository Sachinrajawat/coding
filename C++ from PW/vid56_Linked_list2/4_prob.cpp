/*
given 2 sorted liked lists, merge them into 1 singly linked lit such that the resultong list is also sprted
*/
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

Node* sorted(Node* head1,Node* head2){
        Node* temp1=head1;
        Node* temp2=head2;
        while(temp1!=NULL && temp2!=NULL){
        if(temp1->val<temp2->val){
            cout<<temp1->val<<"->";
            temp1=temp1->next;
        }
        else{
            cout<<temp2->val<<"->";
            temp2=temp2->next;
        }}
        
        
        if(temp2==NULL){
            while(temp1!=NULL){
                cout<<temp1->val<<"->";
                temp1=temp1->next;
            }
        }
        if(temp1==NULL){
            while(temp2!=NULL){
                cout<<temp2->val<<"->";
                temp2=temp2->next;
            }}
        
        }



int main(){
    LinkedList l1,l2,l3;
    l1.insertAtEnd(1);
    l1.insertAtEnd(10);
    l1.insertAtEnd(20);
    l1.insertAtEnd(30);
    l1.insertAtEnd(50);
    l1.display();
    l2.insertAtEnd(5);
    l2.insertAtEnd(15);
    l2.insertAtEnd(25);
    l2.insertAtEnd(35);
    l2.insertAtEnd(45);
    l2.display();
    l3.head=sorted(l1.head,l2.head);
    l3.display();
    return 0;
}