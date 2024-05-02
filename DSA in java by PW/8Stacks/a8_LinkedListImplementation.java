// package DSA in java by PW.8Stacks;

public class a8_LinkedListImplementation {
    public static class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
            
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        // void displayrev(){
        //     Node temp=head;
        //     while(temp!=null){
        //         System.out.print(temp.val+" ");
        //         temp=temp.next;
        //     }
        //     System.out.println();
        // }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            return head.val;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack l=new Stack();
        l.push(1);
        l.push(2);
        l.push(3);
        l.display();  //3 2 1
        System.out.println("size "+l.size()); //3
        l.pop();
        l.display(); //3 2
        System.out.println("Size "+l.size());
        System.out.println(l.peek());
    }
}
