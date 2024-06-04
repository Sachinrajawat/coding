import java.util.Stack;
//postfix to prefix
public class a14_postToPre {
    public static void main(String[] args) {
        String s="953+4*6/-";
        // ans    -9/*+5346
        Stack<String> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                String a=""+ch;
                val.push(a);
            }
            else{
                String v2=val.pop();
                String v1=val.pop();
                String a=ch+v1+v2;
                val.push(a);
            }
        }
        System.out.println(val.peek());
    }
}
