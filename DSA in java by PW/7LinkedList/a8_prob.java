import org.w3c.dom.Node;

public class a8_prob {
    static int middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        Node l1=new Node(100);
        Node l2=new Node(13);
        Node l3=new Node(4);
        Node l4=new Node(5);
        Node l5=new Node(12);
        Node l6=new Node(10);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        display(l1);
        int value=middle(l1);
        System.out.println("middle value  is "+value);
    }
}
