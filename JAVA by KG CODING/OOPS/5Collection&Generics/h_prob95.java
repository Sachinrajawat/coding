// package JAVA KG CODING.OOPS.5Collection&Generics;

// Write a program that takes a string and returns the number of unique characters using a set.

import java.util.HashSet;
import java.util.*;


public class h_prob95 {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String userStr = input.next();
        for(char ch: userStr.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("Your string has %d unique characters",unique.size());
    }
}
