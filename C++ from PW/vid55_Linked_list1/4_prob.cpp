// given the head of sorted linked list,delete all
// duplicates such tHAT each element appears only once. return the linked list sorted as well.

#include<iostream>
using namespace std;

class Node{
    public:
    int val;
    Node* next;

    Node(int data){
        val = data;
        next  = NULL;
    }
};

class LinkedList{
public:
    Node* head;
    LinkedList(){
    head= NULL;
    }

    void insertAtLast(int value){
        Node* new_node = new Node(value);
        if(head ==NULL){
            head = new_node;
            return;
        }
        Node* temp = head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next = new_node;
        cout<<endl;
    }
    void deleteDuplicates(){
        Node* curr_node = head;
        while(curr_node){
            while(curr_node->next && curr_node->val==curr_node->next->val){
                //delete current->next
                Node* temp = curr_node->next;  // Node to be deleted
                curr_node->next = curr_node->next->next;
                free(temp);
            }
            //this loop will ends when current node & current next node values are not same
            curr_node= curr_node->next;
        }
        
        cout<<endl;
    }

    void display(){
        Node* temp = head;
        while(temp!=NULL){
            cout<<temp->val<<"->";
            temp=temp->next;
        }
        cout<<"NULL";
    }
    
};
int main(){
    LinkedList Ll;
    Ll.insertAtLast(1);
    Ll.insertAtLast(2);
    Ll.insertAtLast(3);
    Ll.insertAtLast(4);
    Ll.insertAtLast(4);
    Ll.insertAtLast(5);
    Ll.insertAtLast(5);
    Ll.display();
    Ll.deleteDuplicates();
    Ll.display();
    cout<<endl;

    return 0;
}