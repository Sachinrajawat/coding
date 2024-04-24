
// import a3_LinkedList.Linkedlist;

public class a4_Linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtIndex(int index,int val){
            if(size()==index){
                insertAtEnd(val);
                return;
            }
            else if(index==0){
                insertAtHead(val);
                return;
            }
            
            Node t=new Node(val);
            Node temp=head;
            for(int i=1;i<index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtEnd(5);
        l1.insertAtEnd(6);
        l1.insertAtEnd(7);
        l1.insertAtHead(4);
        l1.insertAtHead(3);
        l1.display();
        l1.insertAtIndex(0, 2);
        l1.display();
        l1.insertAtIndex(6, 8);
        l1.display();
        l1.insertAtIndex(2, 9);
        l1.display();
        l1.insertAtIndex(1, 10);
        l1.display();
        
        System.out.println(l1.size());
    }
}
