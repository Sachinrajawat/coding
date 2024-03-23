//given the head of a singly linked list, reverse the list, and return the reversed list
// 1->2->3->4->5
//output: 5->4->3->2->1

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

        void insertAtEnd(int val){
            Node* new_node=new Node(val);
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
Node* reverse(Node* &head){
            Node* prevptr=NULL;
            Node* currptr=head;
            // current->next=prevptr;
            // move all 3 ptrs by one step ahead
            while(currptr!=NULL){
                Node* nextptr=currptr->next;
                currptr->next=prevptr;
                prevptr=currptr;
                currptr=nextptr;
            }
            //when this loop ends, prevptr pointing to my last node which is new head
            Node* new_head=prevptr;
            return new_head;
        }
        
// BY using recursion
    Node* reverseLLRecursion(Node* &head){
        //base case
        if(head==NULL || head->next==NULL){
            return head;
        }

        // reversive case 

        Node* new_head = reverseLLRecursion(head->next);
        head->next->next=head;
        head->next=NULL; //head is now pointing to last node in reverse linked ist
        return new_head;
    }
int main(){
    LinkedList l1;
    l1.insertAtEnd(1);
    l1.insertAtEnd(2);
    l1.insertAtEnd(3);
    l1.insertAtEnd(4);
    l1.display();
    l1.head=reverse(l1.head);
    l1.display();
    l1.head=reverseLLRecursion(l1.head);
    l1.display();
    return 0;
}