import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.print("Enter file name: ");
        String s=in.nextLine();
        try {
            FileReader f=new FileReader(s);
            Scanner sb=new Scanner(f);
            Map<String,Integer> m=new TreeMap<>();
            while(sb.hasNext()){
                String ch=sb.next();
                if(!m.containsKey(ch)){
                    m.put(ch,1);
                }
                else{
                    int x=m.get(ch);
                    m.put(ch,++x );
                }
            }
            // String[] set=m.keySet().toArray();
            // System.out.println(m.get(set[set.length-1]));
            int max=Integer.MIN_VALUE;
            String str="";
            for(var c:m.keySet()){
                System.out.println(c);
                if(m.get(c)>max){
                    str=c;
                    max=m.get(c);
                    // System.out.println(max);
                }
            }
System.out.println(str+" " +max);
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File not found");
        }
    }
}
