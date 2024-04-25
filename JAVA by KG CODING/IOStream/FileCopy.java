import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            FileOutputStream fos = new FileOutputStream("bbc.txt");
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File Copied");
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
