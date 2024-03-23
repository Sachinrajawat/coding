/*
given 2 linked lists, Tell if they are equal or not. Two linked lists are equal if they have the same 
data and the arrangement of data is also same
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
class LinkedLL1{
    public:
    Node* head;
    LinkedLL1(){
        head=NULL;
    }
    void insertAtEndL1(int value){
        Node* new_node=new Node(value);
        if(head==NULL){
            head=new_node;
            return;
        }
        Node* temp=head;
        while (temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=new_node;
    }
    void displayL1(){
        Node* temp=head;
        while(temp!=NULL){
            cout<<temp->val<<"->";
            temp=temp->next;
        }
        cout<<"NULL"<<endl;
    }
};

bool compare(Node* head1, Node* head2){
    Node* temp1=head1;
    Node* temp2=head2;
    while(temp1!=NULL && temp2!=NULL){
        if(temp1->val!=temp2->val){
        return false;
        }
        temp1=temp1->next;
        temp2=temp2->next;
    }
    // at this point either temp1 is NULL, or temp2 is null, or both are null
    return (temp1==NULL && temp2==NULL);
    
}
int main(){
    LinkedLL1 L1,L2;
    L1.insertAtEndL1(1);
    L1.insertAtEndL1(2);
    L1.insertAtEndL1(3);
    L1.insertAtEndL1(4);
    L1.insertAtEndL1(5);
    L1.displayL1();
    
    L2.insertAtEndL1(1);
    L2.insertAtEndL1(2);
    L2.insertAtEndL1(3);
    L2.insertAtEndL1(4);
    L2.insertAtEndL1(5);
    L2.displayL1();
    cout<<compare(L1.head,L2.head)<<endl;

    return 0;
}