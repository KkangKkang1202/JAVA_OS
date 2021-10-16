package chapter6.example.example1;

class Point
{
    int X;
    int Y;

    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }
}


public class ObjectPropertyEx
{
    public static void Print(Object obj)
    {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        Point p = new Point(2,3);
        Print(p);
    }
}
