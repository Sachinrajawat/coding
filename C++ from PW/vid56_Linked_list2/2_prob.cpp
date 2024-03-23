/*
given the heads of two singly linked-list headA and headB, return the node at which the two lists intersect. If
the two linked lists have no intersection at all, return null

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
int getLength(Node* head){
    Node* temp=head;
    int length =0;
    while(temp!=NULL){
        length++;
        temp=temp->next;
    }
    return length;
} 

Node* moveHeadByK(Node* head,int k){
    Node* ptr=head;
    while(k--){
        ptr=ptr->next;

    }
    return ptr;
}
Node* getIntersection(Node* head1,Node* head2){
    //step1: calculate length of both linked list
    int l1=getLength(head1);
    int l2=getLength(head2);

    //step2: find difference btw linkedlist and move longer linkedlist by k step
    Node* ptr1;
    Node* ptr2;
    if(l1>l2){ //l1 is longer
        int k=l1-l2;
        ptr1=moveHeadByK(head1,k);
        ptr2=head2;

    }
    else{//l2 is longer
    int k=l2-l1;
    ptr1=head1;
    ptr2 =moveHeadByK(head2,k);
    }

    // step3: compare ptr1 and ptr2 nodes
    while(ptr1){
        if(ptr1==ptr2){
            return ptr1;
        }
        ptr1=ptr1->next;
        ptr2=ptr2->next;
    }
    return NULL;
}
int main(){
    LinkedList l1,l2;
    l1.insertAtEnd(1);
    l1.insertAtEnd(2);
    l1.insertAtEnd(3);
    l1.insertAtEnd(4);
    l1.insertAtEnd(5);
    l1.display();
    //1->2->3->4->5->NULL
    
    l2.insertAtEnd(6);
    l2.insertAtEnd(7);
    l2.head->next->next = l1.head->next->next->next;

    // 6->7->4->5->NULL
    l2.display();

    Node* intersection = getIntersection(l1.head,l2.head);
    if(intersection){
        cout<<intersection->val<<endl;
    }
    else{
        cout<<"-1"<<endl;
    }
    return 0;
}