import java.io.*;
import java.util.Scanner;
public class FileReading {
    public static void main(String[] args) {
        try{
            File file = new File("java.txt");
            
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()){
                String str = reader.nextLine();
                System.out.println(str);
            }
            System.out.println("Read susccesful");
            reader.close();

        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}

// nextLine()
