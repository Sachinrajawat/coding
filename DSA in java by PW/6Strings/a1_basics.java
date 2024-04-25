// package DSA in java by PW.6Strings;

public class a1_basics {
    public static void main(String[] args) {
        String s="Sachin Rajawat";
        String s1="Singh";
        System.out.println("charAt(): "+s.charAt(4));
        System.out.println("length(): "+s.length());
        System.out.println("indexOf(): "+s.indexOf('i'));  //1st index dega

        //its check in lexicographically order 
        //it is checking by ASCII value
        //it return the ASCII  difference
        //if s>s1 +ve ans  
        //if s<s1 -ve ans
        //if s=s1 0
        System.out.println("compareTo(): "+s.compareTo(s1));
        System.out.println("contains(): "+s.contains("Raj"));
        System.out.println("startsWith(): "+s.startsWith("S"));
        System.out.println("endsWith(): "+s.endsWith("at"));
        System.out.println("toLowerCase(): "+s.toLowerCase());
        System.out.println("toUpperCase(): "+s.toUpperCase());
        System.out.println("concat(): "+s.concat(s1));

        String s2="Abc";
        s2+="XYZ";
        s2+='r';
        s2+=10;
        System.out.println(s2);
        System.out.println(s2+30+40);
        System.out.println(30+40+s2);

        //substring(i,j) and substring(i)
        // i included, j excluded
        //continuous part of the String
        System.out.println("substring(): "+s.substring(0,3));
        System.out.println("substring(): "+s.substring( 3));

        if(s.equals(s1)) System.out.println("equals(): true");
        else System.out.println("equals(): false");
    }
}
