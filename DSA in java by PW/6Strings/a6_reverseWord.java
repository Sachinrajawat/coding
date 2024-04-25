// package DSA in java by PW.6Strings;

import java.util.Scanner;

public class a6_reverseWord {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        StringBuilder str=new StringBuilder(in.nextLine());
        StringBuilder s=new StringBuilder("");
        String s1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                s.append(ch);
            }
            else{
                s.reverse();
                s1+=s;
                s1+=" ";
                // s.delete(0,s.length());
                s=new StringBuilder("");
            }
        }
        s.reverse();
        s1+=s;
        System.out.println(s1);
    }
}
