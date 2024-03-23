/*given the head of LL, reverse the nodes of the list k at a time, and return the modified list
    1->2->3->4->5->6
    if k=2

    2->1->4->3->6->5 // 2-2 krke reverse krna h

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

Node* reverseAtK(Node* head,int val){
        Node* prev=NULL;
        Node* currptr=head;

        int counter =0; //for counting first k nodes
        while(currptr!=NULL && counter<val){ //reversing firs k nodes
            Node* nextptr = currptr->next;
            currptr->next=prev;
            prev = currptr;
            currptr = nextptr;
            counter++;
        }

        //currrptr will give us (k+1)th node 
        if(currptr!=NULL){
        Node* new_head=reverseAtK(currptr,val); //recursive call
        head->next = new_head;
        }
        
        return prev; 
    }



int main(){
    LinkedList l;
    l.insertAtEnd(1);
    l.insertAtEnd(2);
    l.insertAtEnd(3);
    l.insertAtEnd(4);
    l.display();
    int k;
    cout<<"Enter the k: ";
    cin>>k;
    l.head=reverseAtK(l.head,k);
    l.display();
}