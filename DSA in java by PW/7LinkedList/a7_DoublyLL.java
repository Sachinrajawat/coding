public class a7_DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        } 
        System.out.println();
    }

    public static void displayReverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        } 
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp=random;
        // move this temp backwards to the head
        while(temp.prev!=null){
            temp=temp.prev;
        } 
        //now temp is a head
        //print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        } 
        System.out.println();
    }
    public static Node insertAtHead(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }
    public static Node insertAtTail(Node head,int x){
        
        Node t=new Node(x);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        t.prev=temp;
        return head;
    }
    public static Node insertAtIdx(Node head,int index,int val){
        if(head.prev==null){
            return insertAtHead(head, val); 
        }
        Node t=new Node(val);
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            return insertAtTail(head, val);
        }
        t.next=temp;
        t.prev=temp.prev;
        temp.prev.next=t;
        temp.prev=t;
        return head;
    }

    public static Node deleteAtHead(Node head){
        // Node temp=head;
        head=head.next;
        head.prev=null;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(18);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        displayReverse(e);
        displayRandom(c);
        displayRandom(e);
        Node newHead=insertAtHead(a, 30);
        display(newHead);
        Node end=insertAtTail(newHead, 40);
        display(end);
        Node insert1=insertAtIdx(newHead, 0, 20);
        display(insert1);
        Node insert2=insertAtIdx(newHead, 4, 50);
        display(insert2);
        Node insert3=insertAtIdx(newHead, 7, 90);
        display(insert3);
        Node x=deleteAtHead(newHead);
        display(x);
    }
}
