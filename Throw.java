import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Throw is used for manual exception creation

        try{
            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); // -ve

            if(age < 0){
                throw new IllegalArgumentException("Negative age is not possible!");
        
            }

            System.out.println("Your age is " + age);
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }

        // e.getMessage()
        // e.toString()
        // e.printStackTrace()

    }
}
