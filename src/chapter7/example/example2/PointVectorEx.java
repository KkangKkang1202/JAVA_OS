package chapter7.example.example2;

import java.util.Vector;

class Point
{
    private int X;
    private int Y;

    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public String toString()
    {
        return ("("+this.X+","+this.Y+")");
    }
}

public class PointVectorEx
{
    public static void main(String [] args)
    {
        Vector<Point> vector = new Vector<>();

        vector.add(new Point(2,3));
        vector.add(new Point(-5,20));
        vector.add(new Point(30,-8));

        vector.remove(1);

        for(Point point : vector)
        {
            System.out.println(point);
        }
    }
}
