// Write a program to create Box Class with member variable lenght,breadth,height.
class Box{
    private int lenght,breadth,height;
    public void setDimension(int l,int b,int h)
    {
        lenght=l;
        breadth=b;
        height=h;

    }
    public void showData()
    {
        System.out.println("lenght : = "+lenght);
          System.out.println("breadth  : = "+breadth);
            System.out.println("height : = "+height);
    }
}
public class ObjExample{
    public static void main (String []args)
    {
        Box b1 = new Box();
        b1.setDimension(10,20,30);
        b1.showData();
      //  Box b2 = new Box();
       // b2.showData();
    }
}