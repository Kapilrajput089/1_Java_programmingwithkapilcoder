// write a program to add 10 number using array given by user.
import java.util.Scanner;

public class AddNumberusingArray{
    public static void main(String[] args) {
        int arr[]=new int [10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Numbers : = ");
        for(int i=0;i<=9;i++)
          arr[i]=sc.nextInt();
          for(int  i=0;i<=9;i++)
          sum=sum+arr[i];
          System.out.println("Add 10 Number "+sum);
    }
}