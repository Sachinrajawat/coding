// package DSA in java by PW.6Strings;

public class a3_stringBuilder {
    public static void main(String[] args) {
        // StringBuilder str=new StringBuilder();  //capacity 16
        // StringBuilder str=new StringBuilder(100); //capacity 100
        StringBuilder str=new StringBuilder("Hello ");
        System.out.println(str);

        str.setCharAt(0, 'M');
        System.out.println(str);

        str.append(true);
        str.append(" world");
        System.out.println(str);

        str.insert(3,'D');
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(0, 3); //not included end
        System.out.println(str);

        
    }
}





