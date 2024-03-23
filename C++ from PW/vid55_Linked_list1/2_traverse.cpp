
//TRAVERSE, UPDATION, DELETION

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

//INSERTION AT HEAD
// TIme cmplxty = O(1)
void insertAtHead(Node* &head,int val){
    Node* new_node = new Node(val);
    new_node->next =head;
    head = new_node;
}


//INSERTION AT LAST
//time compl. == O(n)  
void insertAtLast(Node* &head,int val){
    Node* new_node = new Node(val);
    Node* temp = head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    //temp has reached last node
    temp->next=new_node;
}


//INSERTION AT Kth POSITION
//time comp = O(pos)
void insertAtPosition(Node* &head,int val,int pos){
    if(pos==0){
        insertAtHead(head,val);
        return;
    }
    
    Node* new_node = new Node(val);
    Node* temp =head;
    int current_pos=0;
    while(current_pos!=pos-1){
        temp=temp->next;
        current_pos++;
    }
    //temp is pointing to node at pos-1
    new_node->next =temp->next;
    temp->next = new_node;
}

//update at kth position
void updateAtPosition(Node* &head,int val,int pos){
    

    Node* temp =head;
    int current_pos =0;
    while(current_pos!=pos){
        temp=temp->next;
        current_pos++;
    }
    //temp will be pointing to kth position
    temp->val = val;
}


// DELETION


//delete at head
void deleteAtHead(Node* &head){
    Node* temp=head; //node to be deleted
    head = head->next;
    free(temp);

}

//delete at end
void deleteAtEnd(Node* &head){
    
    Node* second_last = head;
    while(second_last->next->next!=NULL){
        second_last=second_last->next;
    }
    //now second_last points to second last node 
    Node* temp = second_last->next;  //node to be deleted
    second_last->next = NULL;
    free(temp);
    
}

void deleteAtPos(Node* &head,int pos){
    if(pos==0){
        deleteAtHead(head);
        return;
    }
    int current_pos=0;
    Node* temp=head;
    while(current_pos!=pos-1){
        temp = temp->next;
        current_pos++;
    }

    //temp is pointing to node aT POS-1
    Node* posi = temp->next;
    temp->next = temp->next->next;
    free(posi);
}
void display(Node* head){
    Node* temp = head;
    while(temp!=NULL){
        cout<<temp->val<<"->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}
int main(){
    Node* head = NULL;
    insertAtHead(head,2);
    display(head);
    cout<<"Insert at head: "<<endl;
    insertAtHead(head,1);
    display(head);
    cout<<"Insert at last: "<<endl;
    insertAtLast(head,3);
    display(head);
    cout<<"Insert at Kth pos: "<<endl;
    insertAtPosition(head,4,2);
    display(head);
    cout<<"Updation at Kth pos: "<<endl;
    updateAtPosition(head,5,1);
    display(head);
    cout<<"Deletion at Head: "<<endl;
    deleteAtHead(head);
    display(head);
    cout<<"Deletion at End: "<<endl;
    deleteAtEnd(head);
    display(head);
    cout<<"Deletion at Kth position: "<<endl;
    deleteAtPos(head,1);
    display(head);
    
}