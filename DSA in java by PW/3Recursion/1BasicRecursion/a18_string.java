import java.util.Scanner;

public class a18_string {
    /* 
    M1
    public static void removeOccurrences(String s,int index,char target){
        if(index==s.length()) return;
        if(s.charAt(index)!=target){
            System.out.print(s.charAt(index)+" ");
            removeOccurrences(s, index+1, target);
        }
        else{
            removeOccurrences(s, index+1, target);
        }
    }
    */
    // M2
    public static String removeOccurrences(String s){
        if(s.length()==0) return "";
        String smallAns=removeOccurrences(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar!='a') return currChar+smallAns;
        else return smallAns;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=in.nextLine();
        System.out.print("String after removing a: ");
        // removeOccurrences(s,0,'a');
        String ans=removeOccurrences(s);

        System.out.println(ans);
    }
}
