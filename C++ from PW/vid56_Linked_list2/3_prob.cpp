/*
given the head of a linked list, remove the k-th node from the end of the list and return its head

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

int length(Node* head){
    Node* temp=head;
    int length=0;
    while(temp!=NULL){
        length++;
        temp=temp->next;
    }
    return length;
}


Node* removeKthNode(Node* head, int k) {
    int len = length(head);

    // Check if k is within valid bounds
    if (k < 1 || k > len) {
        cout << "Invalid k value" << endl;
        return head;
    }

    // If k is 1, remove the head node
    if (k == 1) {
        Node* newHead = head->next;
        delete head;
        return newHead;
    }

    // Find the node before the k-th node
    int targetPos = len - k;
    Node* temp = head;
    for (int i = 1; i < targetPos; i++) {
        temp = temp->next;
    }

    Node* nodeToDelete = temp->next;
    temp->next = nodeToDelete->next;
    delete nodeToDelete;

    return head;
}


int main(){
    LinkedList l1;
    l1.insertAtEnd(1);
    l1.insertAtEnd(2);
    l1.insertAtEnd(3);
    l1.insertAtEnd(4);
    l1.insertAtEnd(5);
    l1.display();
    l1.head=removeKthNode(l1.head,2);
    l1.display();
    return 0;
}