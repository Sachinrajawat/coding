// package CONTEST.CODECHEF;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t > 0) {
            int l = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            double sqrt = Math.sqrt(l);
            // System.out.println(sqrt);
            boolean isValid = true;
            if (sqrt != Math.floor(sqrt)) {
                isValid = false;
            } else {
                int k = 0;
                int lim = (int) (sqrt);
                while (k < lim) {
                    if (s.charAt(k) != '1' || s.charAt(l - k - 1) != '1') {
                        isValid = false;
                        break;
                    }
                    k++;
                }
                if (isValid) {
                    for (int i = lim; i < l - lim; i += lim) {
                        String str = s.substring(i, i + lim);
                        if (str.charAt(0) != '1' || str.charAt(lim - 1) != '1') {
                            isValid = false;
                            break;
                        }
                            for (int j = 1; j < lim - 1; j++) {
                                if (str.charAt(j) != '0') {
                                    isValid = false;
                                    break;
                                }
                            }
                        
                    }
                }
            }
            if (isValid)
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
}
