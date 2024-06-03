import java.util.Stack;

public class a11_prefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            // '0' -> 48 and '9' -> 57
            if (ascii >= 48 && ascii <= 57){
                String s=""+ch;
                val.push(s);
            }
            else if (opr.size() == 0 || ch == '(' || opr.peek() == '(') {
                opr.push(ch);
            }
            else if (ch == ')') {
                while (opr.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char x=opr.pop();
                    val.push(x+v1+v2);
                }
                opr.pop(); // '(' hata diya
            } 
            else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char x=opr.pop();
                    val.push(x+v1+v2);
                    opr.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (opr.peek() == '*' || opr.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char x=opr.pop();
                        val.push(x+v1+v2);
                        opr.push(ch);
                    } else
                        opr.push(ch);
                }
            }

        }
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char x=opr.pop();
            val.push(x+v1+v2);
        }
        System.out.println(val.peek());
    }
    
}
