//concatenate and convert: Take two String, concatenate them, and convert them result to uppercase

import java.util.Scanner;

public class ab_prob71 {
    public static void main(String[] args) {
        String a,b;
        Scanner in=new Scanner(System.in);
        System.out.print("enter first String: ");
        a=in.nextLine();
        System.out.print("enter second String: ");
        b=in.nextLine();
        String c=a.concat(b);
        System.out.println(c);
        System.out.println(c.toUpperCase());
    }
}
