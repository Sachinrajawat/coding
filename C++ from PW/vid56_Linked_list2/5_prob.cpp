/*
you are given an array of linked-lists lists, each linked-list is sorted in ascending order.
merge all the linked-lists into one sorted linked-lists into one sorted linked-list and return it.

*/

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

Node* sortedKLinkedList(vector<Node*> &lists){
    if(lists.size()==0){
        return NULL;
    }
    while(lists.size()>1){
        Node* mergedHead = sorted(lists[0],lists[1]);
        lists.push_back(mergedHead);
        lists.erase(lists.begin());
        lists.erase(lists.begin());

    }
    return lists[0];

}

//vector-> head1 head2 head3 head4
//1. head1 head2 will we merged
// vector -> head head4 mergedhead1_2
//2. head3 and head4 will be merged
//vector-> mergedhead1_2 mergedhead3_4
// 3. mergedhead1_2 and mergedhead3_4 will be merged 
// vector -> mergedhead1_2_3_4


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
    l3.insertAtEnd(4);
    l3.insertAtEnd(14);
    l3.insertAtEnd(24);
    l3.insertAtEnd(34);
    l3.insertAtEnd(44);
    l3.display();

    vector<Node*> lists;
    lists.push_back(l1.head);
    lists.push_back(l2.head);
    lists.push_back(l3.head);

    LinkedList mergedLL;
    mergedLL.head = sortedKLinkedList(lists);
    mergedLL.display();

}