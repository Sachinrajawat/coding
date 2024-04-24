public class a5_prob {
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
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        int returnLL(int index){
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int index){
            Node temp=head;
            if(index==0){
                head=temp.next;
            }
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.display();
        System.out.println(l1.returnLL(2));
        l1.deleteAt(0);
        l1.display();
        l1.deleteAt(3);
        l1.display();
        
    }
}
