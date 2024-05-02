//Find the nth node from the end of linked list
public class a6_prob {
    /*// M2
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int m=size-n+1;
        //mth node form start
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }*/
    //M2
    public static Node nthNode(Node head,int n){
        Node slow=head;
        Node fast=head;
        
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a.data);
        Node x=nthNode(a,4);
        System.out.println("nth value from the last: "+x.data);
    }
}
