// package CSE330 CLASS.UNIT1;

import java.util.Scanner;

public class a1_isPrime {
    static boolean isPrime(int n){
        //corner cases
        if(n<=1) return false;
        if(n<=3) return true;
        //This is checked so that we can skip
        //middle five number in below loop
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i<=Math.sqrt(n);i+=6) if(n%i==0 || n%(i+2)==0) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(63));
        System.out.println(isPrime(19));
    }
}
