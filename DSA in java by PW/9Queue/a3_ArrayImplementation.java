/**
 * a3_ArrayImplementation
 */
public class a3_ArrayImplementation {
    public static class queueA {
        int f = -1;// front
        int r = -1;// rear
        int size = 0;
        int[] arr = new int[100];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {// queue is currently empty
                f = r = 0;
                arr[0] = val;
                r++;
            } else {
                arr[r] = val;
                r++;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            } else {
                for (int i = f; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}