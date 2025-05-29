import java.io.*;

public class FileCreation {
    public static void main(String[] args) {
        
        try{
            File file = new File("java.txt");
            if(file.createNewFile()){
                System.out.println("File Created Successfully! and the file name is " + file.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An error occured while creating the file");
        }


    }
}
// 1. createNewFile()
// 2. getName()
// 3. getAbsolutePath()
// 4. exists()
// 5. delete()
// 6. canRead()
// 7. canWrite()
