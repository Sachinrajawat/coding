import java.util.Scanner;

class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
    
        int max = 0, curr = 0;
        boolean stock = false;
        
        for (int i = 0; i < n; i++) {
            if (s[i] == 1) {
                max = Math.max(max, curr);
                curr = 0;
                stock = true;
            } else if (s[i] == 0) {
                if (stock) {
                    curr++;
                }
            } else if (s[i] == -1) {
                max = Math.max(max, curr);
                curr = 0;
                stock = false;
            }
        }
        
        max = Math.max(max, curr);
        System.out.println(max);
    }
}
