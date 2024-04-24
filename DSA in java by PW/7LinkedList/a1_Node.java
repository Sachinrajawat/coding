// package DSA in java by PW.7LinkedList;



public class a1_Node {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
    }

    //recursively

    public static void displayRecurs(Node head){
        if(head==null) return;
        System.out.print(head.data+"-->");
        displayRecurs(head.next);
    }
    // display reverse LL 
    public static void displayLLreverse(Node head){
        if(head==null) return;
        displayLLreverse(head.next);
        System.out.print(head.data+"-->");
        
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
        System.out.println(a.next.next.next.data);

        Node temp=a;
        for (int i = 1; i <=5; i++) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

        //by using while loop displaying LL
        temp=a;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        //by using function
        System.out.println();
        display(a);

        //recursively
        System.out.println();
        displayRecurs(a);

        //reverse LL
        System.out.println();
        System.out.print("Reverse LL: ");
        displayLLreverse(a);
    }
}
