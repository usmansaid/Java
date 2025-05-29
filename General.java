import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
        try{
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num2 == 0){
            System.out.println("Num2 must be greater than 0");
            continue;
        }

        int result = num1 / num2;
        System.out.println(result);
        break;


        }catch(ArithmeticException e){
            System.out.println("Error, / zero");
        }

        }

    }
}

// default throw and our catch