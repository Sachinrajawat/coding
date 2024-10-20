//given a number n,determine weather it is happy number or not
//if number reaches to 1 then it is happy number other wise not
//ex 82=64+4=68  adding square of the digit
//68=36+64=100
//100=1+0+0=1 return true


//make the hashset store all the output if the number is already present in the hashset then return false
import java.util.HashSet;
import java.util.Scanner;

/**
 * happyNumber
 */
public class happyNumber {
    public static boolean happyNumber(int n,HashSet<Integer> set){
        if(set.contains(n)) return false;
        if(n==1) return true;
        set.add(n);
        int num=0;
        while(n>0){
            int x=n%10;
            num+=Math.pow(x,2);
            n/=10;
        }
        return happyNumber(num, set);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        HashSet<Integer> set=new HashSet<>();
        System.out.println(happyNumber(n,set));
    }
}
