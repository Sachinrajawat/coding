//given head,the head of a linked list, determine if the linked list has a cycle in it.


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
bool detectCycle(Node* &head){
    if(!head || !head->next){
        return false;
    }
    Node* slowPtr=head;
    Node* fastptr=head;
    while(fastptr && fastptr->next){
        slowPtr = slowPtr->next;
        fastptr=fastptr->next->next;
        if(slowPtr==fastptr){
            Node* ptr=head;
            while(ptr!=slowPtr){
                ptr=ptr->next;
                slowPtr=slowPtr->next;
            }
            cout<<"Cycle starts at: "<<ptr->val<<endl;
            return true;
        } 
        
    }
    return false;
}


int main(){
    LinkedList l1;
    l1.insertAtEnd(1);
    l1.insertAtEnd(1);
    l1.insertAtEnd(2);
    l1.insertAtEnd(3);
    l1.insertAtEnd(5);
    l1.insertAtEnd(5);
    l1.display();
    l1.head->next->next->next->next->next->next->next->next=l1.head->next->next;
    cout<<detectCycle(l1.head)<<endl;

    return 0;
    }

#include<iostream>
#include<algorithm>
using namespace std;

template<class a1>
a1 min(a1 x[], int n){
    sort(x,x+n);
    cout<<endl<<"Minimum value : ";
    return x[0];
}
int main(){
    int n;
    cin>>n;
    int x[n];
    for(int i=0; i<n; i++){
        cin>>x[i];
    }
    cout<<min<int>(x,n);
}