// package JAVA by KG CODING.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileOutputStream fos=new FileOutputStream("bbc.txt");
        fos.write(5);
        System.out.println("Data is saved");
        fos.close();

    }
}
