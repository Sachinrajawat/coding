// package DSA in java by PW.8Stacks;

import java.util.Scanner;
import java.util.Stack;

public class a3_copyStack {
    public static void main(String[] args) {
    Stack<Integer> st1=new Stack<>();
    // st1.push(1);
    // st1.push(2);
    // st1.push(3);
    // st1.push(4);
    Scanner in=new Scanner(System.in);
    System.out.print("Enter size: ");
    int n=in.nextInt();
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
        int x=in.nextInt();
        st1.push(x);
    }
    System.out.println("St1: "+st1);

    Stack<Integer> st2=new Stack<>();
    
    // M1
    // st2.addAll(st1);
    // System.out.println("St2: "+st2);


    //M2
    //reverse Order
    while(st1.size()>0){
        int x=st1.peek();
        st2.push(x);
        st1.pop();
    }
    System.out.println("St2: "+st2);
    
    Stack<Integer> st3=new Stack<>();
    while(st2.size()>0){
        int x=st2.peek();
        st3.push(x);
        st2.pop();
    }
    System.out.println("St3: "+st3);
}
}
