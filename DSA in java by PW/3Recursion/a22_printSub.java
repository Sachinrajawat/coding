import java.util.*;
public class a22_printSub {
    public static void printSub(String s,String currAns){
        if(s.length()==0){
            System.out.print(currAns+" ");
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        printSub(remString, currAns+curr);  //add curr
        printSub(remString, currAns); //do not add curr
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=in.nextLine();
        printSub(s,"");
    }
}
