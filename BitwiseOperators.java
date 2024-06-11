public class BitwiseOperators
{
    public static void main(String[] args) {
        // Bitwise Operators are :- (&, |, ^, >>, <<).
        
          int a=10,b=30,c;
          c=a&b;
          System.out.println("1. A&b : = "+c);
          c=a|b;
          System.out.println("2. A|B : = "+c);
          c=a^b;
          System.out.println("3. A^B : = "+c);
          c=a>>b;
          System.out.println("4. A>>B : = "+c);
          c=a<<b;
          System.out.println("5.A<<b : = "+c);


    }
}