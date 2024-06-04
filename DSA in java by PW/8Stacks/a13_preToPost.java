import java.util.Stack;
//prefix to postfix conversion
public class a13_preToPost {
    public static void main(String[] args) {
        String s="-9/*+5346";
        //ans = 953+4*6/-
        Stack<String> val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                String a=""+ch;
                val.push(a);
            }
            else{
                String v1=val.pop();
                String v2=val.pop();
                String a=v1+v2+ch;
                val.push(a);
            }
        }
        System.out.println(val.peek());
    }
}
