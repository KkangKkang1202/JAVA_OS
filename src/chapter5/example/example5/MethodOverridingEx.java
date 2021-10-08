package chapter5.example.example5;

class Shape
{
    public Shape next;
    public Shape()
    {
        this.next = null;
    }

    public void Draw()
    {
        System.out.println("Shape");
    }
}

class Line extends Shape
{
    @Override
    public void Draw()
    {
        System.out.println("Line");
    }
}

class Rect extends Shape
{
    @Override
    public void Draw()
    {
        System.out.println("Rect");
    }
}

class Circle extends Shape
{
    @Override
    public void Draw()
    {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx
{
    static void Paint(Shape shape)
    {
        shape.Draw();
    }

    public static void main(String[] args)
    {
        Line line = new Line();
        Paint(line);

        Paint(new Shape());

        Paint(new Line());

        Paint(new Rect());

        Paint(new Circle());
    }
}
