package Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        FileWriter writer = new FileWriter("java.txt");
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();
        writer.write(input);
        writer.close();
        System.out.println("Wrote successfully!");

        }catch(IOException e){
            System.out.println("An error occurred while writing to the file");
        }
    }
}
