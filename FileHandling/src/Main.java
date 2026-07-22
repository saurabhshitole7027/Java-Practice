import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static <exception> void main(String[] args) throws IOException {System.out.println("Hello world!");
        File file1 = new File("java.txt");
//        System.out.println(file1.exists());
//        file1.createNewFile();
//        System.out.println(file1.isFile());
//        System.out.println(file1.exists());
//        System.out.println(file1.isDirectory());
//        FileWriter f1 = new FileWriter(file1,true);
//        f1.write("Welcome to the Java I/O");
//        f1.write("\n");
//        f1.write("Lets Learn the Input");
//        f1.close();
        FileReader f1 = new FileReader(file1);
        int s = f1.read();
        System.out.println((char) s);
    }
}