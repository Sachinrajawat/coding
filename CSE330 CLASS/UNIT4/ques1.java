import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class ques1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        ArrayList<Character> lower=new ArrayList<>();
        ArrayList<Character> upper=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a') lower.add(s.charAt(i));
            else upper.add(s.charAt(i));
        }
        Collections.sort(upper);
        Collections.sort(lower);
        String ans="";
        int j=0,k=0;
        for(int  i=0;i<s.length();i++){
            if(s.charAt(i)>='a')
                ans+=lower.get(j++);
            else ans+=upper.get(k++);
        }
        System.out.println(ans);
    }
}