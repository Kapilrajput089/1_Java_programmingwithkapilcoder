
import java.util.Scanner;

public class ArrayReversNumber{

   // private static String i;
    public static void main(String[] args) {
        int arr[]=new int[10];                      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Numbers : = ");
        for(int i=0;i<10;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
        }
    }
}