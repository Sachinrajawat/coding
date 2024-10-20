// package DP AdityaVerma.0-1Knapsack Problem;

/*Subset sum


*/
import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

public class a1_subsetSum {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] countTown = new int[num];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            pq.add(x);
        }

        int ans = 0;
        int x = pq.poll();
        ans++;

        while (pq.size() > 0) {
            int a = pq.poll();
            ans++;
            x--;
            if (x > 0) {
               pq.add(x);
            }
            x = a;
        }

        System.out.println(ans);
    }
}
