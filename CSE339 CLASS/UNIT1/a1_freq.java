// package CSE339 CLASS.UNIT1;

import java.util.HashMap;
import java.util.Scanner;

public class a1_freq {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=in.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
    }
}
