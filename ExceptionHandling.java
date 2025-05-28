public class ExceptionHandling {
    public static void main(String[] args) {
       try{
        int num1 = 2;
        int num2 = 2;

        int result = num1 / num2; //1

        System.out.println(result);
        return;

       }catch(ArithmeticException e){
        System.out.println("Division by zero");
       }
      finally{

          System.out.println("Program finished...");
      }
      // Finally is mainly used for closing some classes
      // Scanner
      // File

    }
}
