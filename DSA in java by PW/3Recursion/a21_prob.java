import java.util.*;

public class a21_prob {
    public static ArrayList<String> subsequences(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> smallAns=subsequences(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=in.nextLine();
        ArrayList<String> ans=subsequences(s);
        System.out.println(ans);
    }
}
