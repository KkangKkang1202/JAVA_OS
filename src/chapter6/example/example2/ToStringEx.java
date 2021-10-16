package chapter6.example.example2;

class Point
{
    int X;
    int Y;
    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public String toString()
    {
        return ("Point("+this.X+","+this.Y+")");
    }
}

public class ToStringEx
{
    public static void main(String [] args)
    {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p+"입니다.");
    }
}
