class A extends Thread{
   @Override
    public void run(){
        int i;
        for(i=0;i<=10;i++)
        System.out.print(" "+i);

/*
    * In java a thread is a lightweight subprocess a separate path of exeution within a program ,it allows you to perform multiple tasks concurrently .
    * you can create new threads in java  by:
    * Extending the thread class.
    * Implementing the Runnable interface.
  */  }

}
class B extends Thread{
      @Override
    public void run(){
        int i;
        for(i=0;i<=10;i++)
        System.out.print(" "+i);

    }
}
public class Threads{
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        a1.start();
        b1.start();
    }

}