

import java.util.Scanner;
public class a8_PrimePalindrome {
    

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true; 
        if (num % 2 == 0) return false; 
        // Check divisibility from 3 up to √num, skipping even numbers
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
public static int nextPalindrome(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        
        // Handle odd and even length palindromes
        String firstHalf = s.substring(0, (len + 1) / 2); // First half of the number
        StringBuilder palindrome = new StringBuilder(firstHalf);
        if (len % 2 != 0) {
            palindrome.append(new StringBuilder(firstHalf).reverse().substring(1)); // Mirror and exclude middle
        } else {
            palindrome.append(new StringBuilder(firstHalf).reverse()); // Mirror completely
        }
        
        int palin = Integer.parseInt(palindrome.toString());
        if (palin >= num) {
            return palin;
        }

        // If generated palindrome is less than the number, increment and generate again
        int firstHalfNum = Integer.parseInt(firstHalf) + 1;
        firstHalf = Integer.toString(firstHalfNum);
        palindrome = new StringBuilder(firstHalf);
        if (len % 2 != 0) {
            palindrome.append(new StringBuilder(firstHalf).reverse().substring(1)); // Mirror and exclude middle
        } else {
            palindrome.append(new StringBuilder(firstHalf).reverse()); // Mirror completely
        }
        
        return Integer.parseInt(palindrome.toString());
    }

    // Function to find the next prime palindrome greater than or equal to N
    public static int nextPrimePalindrome(int N) {
        if (N <= 2) return 2; // Handle edge case for smallest prime palindrome

        int candidate = N;
        while (true) {
            // Generate the next palindrome
            candidate = nextPalindrome(candidate);
            
            // If it's a prime number, return it
            if (isPrime(candidate)) {
                return candidate;
            }

            // Move to the next potential palindrome
            candidate++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        int result = nextPrimePalindrome(N);
        System.out.println("The next prime palindrome >= " + N + " is: " + result);
        
        scanner.close();
    }
}
