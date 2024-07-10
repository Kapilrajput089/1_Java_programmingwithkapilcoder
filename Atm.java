
import java.util.*;

public class Atm{
    public static void main(String[] args) {
        int Balance=5000;
        int choice;
        Scanner s1=new Scanner(System.in);
       
        System.out.println("1.Check  Balance ");
        System.out.println("2.Withdraw Amount ");
        System.out.println("3.Deposit Balance ");
        System.out.println("4.Exit  ");
        System.out.print("Enter your choice : = ");
        choice= s1.nextInt();
        switch(choice){
            case 1 -> {
                System.out.println("your Current Balance "+Balance);
            }
            case 2 -> {
                    System.out.println("Enter withdraw Amount : = ");
                    int withdraw = s1.nextInt();
                    try {
                        if(Balance<withdraw)

                   throw new ArithmeticException("insufficient Balance");
                    Balance=Balance-withdraw;
                    System.out.println("Current Balance is "+Balance);
                    } 
                    catch (ArithmeticException e) {
                       System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                        System.out.print("Enter the Deposit Amount : = ");
                        int Deposit = s1.nextInt();
                        Balance=Balance + Deposit;
                        System.out.println("Deposit Balance sucessfully  ");
                    }
                case 4 -> {
            }
                     default -> System.out.println("Enter valid option ");
        }
        //exit(1);
        


    }
}