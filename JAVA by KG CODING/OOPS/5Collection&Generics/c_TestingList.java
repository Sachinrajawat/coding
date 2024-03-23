// package JAVA KG CODING.OOPS.5Collection&Generics;

import java.util.ArrayList;
import java.util.List;

public class c_TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        // List<String> strList = new ArrayList<String>();
        // List strList = new ArrayList();
        strList.add("Sachin");
        strList.add("Rajawat");
        strList.add(1, "Mr.");
        System.out.println(strList.get(0));

        strList.remove(0);
        if(strList.contains("Rajawat")){
            System.out.println("Rajawat Exist");
            System.out.println("Index of Rajawat: "+strList.indexOf("Rajawat"));
        }

        for(int i=0;i<strList.size();i++){
            System.out.print(strList.get(i));
        }
    }
}
