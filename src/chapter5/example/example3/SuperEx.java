package chapter5.example.example3;

import java.awt.*;

class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x; this.y = y;
    }

    public void showPoint()
    {
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint extends Point
{
    private String Color;

    public ColorPoint(int x, int y, String Color)
    {
        super(x,y);
        this.Color = Color;
    }

    public void showColorPoint()
    {
        System.out.print(this.Color);
        this.showPoint();
    }
}

public class SuperEx
{
    public static void main(String [] args)
    {
        ColorPoint colorPoint = new ColorPoint(5,6,"Blue");
        colorPoint.showColorPoint();
    }
}
