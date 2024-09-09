// package DSA in java by PW.13Heap;

public class a1_HeapInsert {
    static class MaxHeap{
        int[] arr;
        int size; //total elements in heap
        int total_size; // total size of array

        MaxHeap(int n){
            arr=new int[n];
            size=0;
            total_size=n;
        }

        //insert into the heap
        void insert(int value){
            //if heap size is available or not
            if(size==total_size){
                System.out.println("Heap overflow");
                return;
            }
            arr[size]=value;
            int index=size;
            size++;

            while (index>0 && arr[(index-1)/2]<arr[index]) {
                int temp=arr[index];
                arr[index]=arr[(index-1)/2];
                arr[(index-1)/2]=temp;
                index=(index-1)/2;
            }
            System.out.println(arr[index]+" is inserted into the heap");
        }
        void delete(){
            if(size==0){
                System.out.println("Heap underflow");
                return;
            }
            System.out.println(arr[0]+" Deleted from the heap");
            arr[0]=arr[size-1];
            size--;
            if(size==0)
                return;
            Heapify(0);
            
        }
        void Heapify(int index){
            int largest=index;
            int left=2*index+1;
            int right=2*index+2;

            //Largest will store the index of the element which is
            //greater between, left child and right child
            if(left<size && arr[left]>arr[largest]) largest=left;
            if(right<size && arr[right]>arr[largest]) largest=right;
            if(largest!=index){
                int temp=arr[index];
                arr[index]=arr[largest];
                arr[largest]=temp;
                Heapify(largest);
            }
        }
        void printArr() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MaxHeap h1=new MaxHeap(6);
        h1.insert(4);
        h1.insert(14);
        h1.insert(11);
        h1.insert(1);
        h1.insert(111);
        h1.insert(1114);
        h1.insert(111);
        h1.printArr();
        h1.delete();
        h1.printArr();
        h1.delete();
        h1.delete();
        h1.delete();
        h1.printArr();
    }
}
