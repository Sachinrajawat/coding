// package DSA in java by PW.8Stacks;

import java.util.Scanner;
import java.util.Stack;


public class a9_balancedBracket {
    //M1
    /*
    public static boolean isBalanced(String s){
        int size=s.length();
        if(size%2!=0){
            return false;
        }
        int x=0;
        for(int i=0;i<size;i++){
        if(s.charAt(i)=='('){
            x++;
        }
        else x--;
        if(x<0){
            return false;
        }
        }
        if(x==0){
            return true;
        }
        return false;
    }*/

    // M2
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
            if(st.size()>0) return false;
            else return true;
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=in.nextLine();
        if(isBalanced(s)){
            System.out.println("String is balanced");
        }
        else System.out.println("String is not balanced");
    }
}
