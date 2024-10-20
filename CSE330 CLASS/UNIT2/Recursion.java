/**
 * Recursion
 */
public class Recursion {
    static void fun(int n){
        if(n>2){
            fun(n-1);
            fun(n-2);
            fun(n-3);
        }
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        fun(5);
    }
}