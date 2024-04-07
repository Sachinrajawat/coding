//swapping two number
public class a_6swap {
    static void swap(int a,int b){
        System.out.println("original value before swap");
        System.out.println("A: "+a);
        System.out.println("b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("values after swap");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }

    static void swapSumDifference(int a,int b){
        System.out.println("By sum and difference method");
        System.out.println("original value before swap");
        System.out.println("A: "+a);
        System.out.println("b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("values after swap");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr={1,2,3,4,5};
        swap(a,b);
        swapSumDifference(a, b);
    }
}
