public class a5_circularQueueArray {
    public static class CirQueueArr{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[5];
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is Full");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){// normal case
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else{
                int val=arr[front];
                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }
            
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            }
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        CirQueueArr cq=new CirQueueArr();
        cq.display();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        // cq.add(5);
        cq.display(); //1 2 3 4
        cq.remove();
        cq.display(); //2 3 4
        cq.add(5);
        cq.display();
        cq.add(6);
        cq.display();
        // cq.add(7);
    }
}
