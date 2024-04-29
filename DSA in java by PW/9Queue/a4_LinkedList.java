public class a4_LinkedList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Queue1 {
        Node head = null;
        Node tail=null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                // temp.next = head;
                head = tail=temp;
                // tailPre=temp;
            } else {
                tail.next=temp;
                // tailPre.next=temp;
                tail=temp;
            }
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            Node temp=head;
            head=head.next;
            size--;
            return temp.val;
        }
        int size(){
            return size;
        }
        int peek(){
            return head.val;
        }
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display(); // 1 2 3
        System.out.println(q.peek()); //1
        q.remove();
        q.display(); //2 3
        System.out.println(q.size()); //2
    }
}
