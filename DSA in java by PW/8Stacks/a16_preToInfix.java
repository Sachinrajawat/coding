import java.util.Stack;
//prefix to infix
public class a16_preToInfix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        // ans    9-(5+3)*4/6
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
                String a="("+v1+ch+v2+")";
                val.push(a);
            }
        }
        System.out.println(val.peek());
    }
}
