package chapter5.example.example1;

class Point
{
    private int x;
    private int y;

    public void set(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void showPoint()
    {
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint extends Point
{
    private String Color;
    public void setColor(String Color)
    {
        this.Color = Color;
    }

    public void showColorPoint()
    {
        System.out.print(Color);
        super.showPoint();
    }
}

public class ColorPointEx
{
    public static void main(String[] args)
    {
        Point point = new Point();
        point.set(1,2);
        point.showPoint();

        ColorPoint colorPoint = new ColorPoint();
        colorPoint.set(3,4);
        colorPoint.setColor("Red");
        colorPoint.showColorPoint();
    }
}
