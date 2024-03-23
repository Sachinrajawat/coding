// package JAVA KG CODING.OOPS.4Exception&FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args){
        String fileName = " java-course.txt";
        
        try(FileWriter writer=new FileWriter(fileName)){
        writer.write("This is the best java course");
        writer.flush();
        System.out.println("File Written Successfully");
        }catch(IOException exception){
            System.out.printf("Exception occured %s\n",exception.getMessage());
        }
    }
}
