public class ExceptionHandling{

    public static void main(String[] args) {
        try {
            System.out.println("Result is : = "+10/0);
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }

}
/*
       **what is Exeption Handling in java.
       * Exception Handling  in java a mechanism to manage runtime erros, preventing the program from crashing and allowing 
         it to Handle these error gracefully.
        *** Try  Catch Block ***
        * THis is the core of Exception Handling .
        * Try the code that might throw an exception is placed inside a try block.
        * Catch if an exception occurs within the try block it's caught by a corresponding catch block ,You can have multiple catch blocks to handle different types of exceptions.
*/