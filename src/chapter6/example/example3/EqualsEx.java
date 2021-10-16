package chapter6.example.example3;

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
    public boolean equals(Object obj)
    {
        if(obj instanceof Point)
        {
            Point point = (Point)obj;
            if(this.X == point.X && this.Y == point.Y)
            {
                return (true);
            }
            else
            {
                return (false);
            }
        }
        return (false);
    }
}

public class EqualsEx
{
    public static void main(String [] args)
    {
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = new Point(3,4);

        // 참조값 비교
        if(a==b)
        {
            System.out.println("a==b");
        }
        if(a.equals(b))
        {
            System.out.println("a is equal to b");
        }
        if(a.equals(c))
        {
            System.out.println("a is equal to c");
        }
    }
}
