
import java.util.*;

public class Function{
    public static int  calculatrSum(int a,int b)
    
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