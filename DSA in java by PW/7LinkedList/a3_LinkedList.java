// package DSA in java by PW.7LinkedList;

public class a3_LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {

            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ // empty LL
                head=tail=temp;
            }
            else{ //non empty LL
                temp.next=head;
                head=temp;
            }
        }
        void insertAtIndex(int index,int val){
            Node t=new Node(val);
            Node temp=head;
            
            if(index==size()){
                insertAtEnd(val);
                return;
            }
            else if(index==0){
                insertAtHead(val);
                return;
            }
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count=0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        System.out.print("Display LL: ");
        ll.display();
        System.out.println("Size: "+ll.size());
        ll.insertAtEnd(12);
        System.out.print("Display LL: ");
        ll.display();
        ll.insertAtHead(6);
        ll.insertAtHead(3);
        
        System.out.print("Display LL: ");
        ll.display();
        ll.insertAtIndex(1, 7);
        System.out.print("Display LL: ");
        ll.display();
        ll.insertAtIndex(2, 10);
        System.out.print("Display LL: ");
        ll.display();
        ll.insertAtIndex(1, 14);
        System.out.print("Display LL: ");
        ll.display();
        
    }
}
