import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class prob88 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter file name: ");
    String filename= in.nextLine();
    try(FileReader reader = new FileReader(filename)){
        int read=0;
        do{
            read = reader.read();
            System.out.print((char)read);
        }while(read != -1);

    }catch(FileNotFoundException e) {
    System.out.println(filename+" file Not found");
        
    }catch(IOException e){
System.out.println("Input output exception");
    }
    }
}
