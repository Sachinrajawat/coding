//find the middle element of the given linked list
#include<iostream>
#include<vector>
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

Node* FindmiddleNode(Node* &head){
    Node* slowPtr=head;
    Node* fastptr=head;

    while(fastptr!=NULL && fastptr->next!=NULL){
        slowPtr=slowPtr->next;
        fastptr=fastptr->next->next;

    }
    return slowPtr;
}


int main(){
    LinkedList l1;
    l1.insertAtEnd(1);
    l1.insertAtEnd(10);
    l1.insertAtEnd(20);
    l1.insertAtEnd(30);
    l1.insertAtEnd(50);
    l1.insertAtEnd(50);
    l1.display();

    Node* middleNode=FindmiddleNode(l1.head);
    cout<<middleNode->val<<endl;
    return 0;
    }