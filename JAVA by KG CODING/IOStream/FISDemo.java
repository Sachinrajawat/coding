// package JAVA by KG CODING.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) {
        try{
        FileInputStream fis=new FileInputStream("abc.txt");
        int data;
        while ((data=fis.read())!=-1) {
            System.out.println(data+" "+(char)data);
        }
        fis.close();
    }catch(FileNotFoundException e){
        System.out.println(e.getMessage());
    }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
