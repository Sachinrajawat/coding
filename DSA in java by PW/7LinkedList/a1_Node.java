// package DSA in java by PW.7LinkedList;

public class a1_Node {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(7);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        System.out.println(a);
        a.next=b;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(a.next.data);
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(c.next.data);
    }
}
