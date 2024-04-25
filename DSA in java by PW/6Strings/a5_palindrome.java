// package DSA in java by PW.6Strings;

public class a5_palindrome {
    public static boolean isPalindrome(String str){
        StringBuilder gtr=new StringBuilder(str);
        gtr.reverse();
        String s=gtr+""; //bcz stringBuilder not converted into String
        if(str.equals(s)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s="abc";
        int count=0;
        for(int i=0;i<s.length();i++){
            for (int j = i+1; j <= s.length(); j++) {
                boolean x=isPalindrome(s.substring(i,j));
                if(x) count++;
            }
        }
        System.out.println("number of palindrome substring are: "+count);
    }
}
