// package JAVA KG CODING.OOPS.5Collection&Generics;

public class g_prob89 {
    public static String concatenateString(String... a){
        StringBuilder sb = new StringBuilder();
        for (String string : a) {
            sb.append(string).append(" ");
        }
        return sb.toString();
        }
    public static void main(String[] args) {
        System.out.println(concatenateString("Sachin","Singh","Rajawat"));
    }
}
