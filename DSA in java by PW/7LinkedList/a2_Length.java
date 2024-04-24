// package DSA in java by PW.7LinkedList;

public class a2_Length {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(40);
        Node e=new Node(5);
        Node f=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println("Length: "+length(a));
    }
    public static int length(Node head){
        
        if(head==null) return 0;
        int count=1;
        count+=length(head.next);
        return count;
    }
}
