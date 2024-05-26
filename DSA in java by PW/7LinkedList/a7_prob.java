
// Finding intersection of two LinkedList
public class a7_prob {
    static int intersection(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int len1=0;
        int len2=0;
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        // System.out.println(len1);
        temp1=head1;
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        // System.out.println(len2);
        temp2=head2;
        if(len1>len2){
            for(int i=0;i<(len1-len2);i++){
                temp1=temp1.next;
            }
        }
        else{
            for (int i = 0; i < (len2-len1); i++) {
                temp2=temp2.next;
            }
        }
        // System.out.println(temp2.val);
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        // System.out.println(temp1.val);
        return temp1.val;
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
        Node m1=new Node(90);
        Node m2=new Node(9);
        // Node m3=new Node(5);
        // Node m4=new Node(12);
        // Node m5=new Node(10);
        m1.next=m2;
        m2.next=l4;
        l4.next=l5;
        l5.next=l6;
        // l5.next=l6;
        display(l1);
        display(m1);
        int value=intersection(l1, m1);
        System.out.println("Intersection is "+value);

    }
}
