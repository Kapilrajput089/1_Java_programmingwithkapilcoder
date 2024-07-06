
import java.util.*;

public class Function{
    public static int  calculatrSum(int a,int b) 
                                        /*
                               * what is function in java.
                               * A function is a block of code that performs a specific task.
                               * *if same functionality is perforemed at multiple places in software then rather then writing the 
                               * same code agian and agian we create a function and call it every where This helps reduce code redundancy.
                                    ** Function  Tenchnical treams **
                                    * Function Definition.
                                    * Function Declaration.
                                    * Function Call. 
                                     
                    
                                    *** Benefits of function ***

                                      Modularization.
                                      Easy to read.
                                      Easy to debug.
                                      Easy to modify. 
                                        */
    
    {
        int sum = a + b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number A and b : = ");
        int a = sc.nextInt();
        int B = sc.nextInt();
        int sum = calculatrSum(a, B);
        System.out.println("sum of two Numbers : "+sum);
    }

}
/*  
       ***Ways to difine a function***
          * Take nothing, Return nothing,
          * Take somthing, Return nothing,
          * Take nothing, Return somthing,
          * Take somthing, Return somthing,

*/