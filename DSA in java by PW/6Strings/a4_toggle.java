// package DSA in java by PW.6Strings;
//input: PhysICS
//output: pHYSics

import java.util.Scanner;

public class a4_toggle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter String: ");
        StringBuilder str=new StringBuilder(in.nextLine());
        System.out.println("Before: "+str);

        //toggle
        for(int  i=0;i<str.length();i++){
            boolean flag =true; //true->capital
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci>=97) flag=false;
            if(flag){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println("Toggle: "+str);
    }
}
