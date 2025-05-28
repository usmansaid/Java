import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {

    public static void divide(Scanner scanner) throws ArithmeticException, InputMismatchException{
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = num1 / num2;

        System.out.println(result);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use with a method, warn the program that the given exception is to be handled

        try{
            divide(scanner);
        }catch(ArithmeticException e){
            System.out.println("Division by zero Exception!");
        }catch(InputMismatchException e){
            System.out.println("Input is not an integer!");
        }catch(Exception e){
            System.out.println("An error occurred");
        }catch(Throwable e){
            System.out.println("Error occurred");
        }
    }
}
