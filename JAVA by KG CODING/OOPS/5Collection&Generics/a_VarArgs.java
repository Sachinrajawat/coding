// package JAVA KG CODING.OOPS.5Collection&Generics;



public class a_VarArgs {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sum(1,8));
        System.out.println(add(1,2,3,4,5));
    }
    // public static int sum(int a, int b){
    //     return a+b;
    // }

    public static int sum(int... a){  //for sum of any number
        int sum = 0;     //sign  ...=ellipses
        for (int a2 : a) {
        sum+=a2;
        }
        return sum;
    }
    public static int add(int first,int second,int... a){ //means min 2 number to chahiye hi
        int sum=first+second;
        for (int i : a) {
            sum +=i;
        }
        return sum;
    }
}
