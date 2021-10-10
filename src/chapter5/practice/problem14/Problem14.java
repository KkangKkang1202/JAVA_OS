package chapter5.practice.problem14;

interface Shape
{
    double PI = 3.14;
    void Draw();
    double GetArea();
    default public void reDraw()
    {
        System.out.print("---다시 그립니다. ");
        Draw();
    }
}

class Circle implements Shape
{
    private double Radius;

    public Circle(double Radius)
    {
        this.Radius = Radius;
    }

    @Override
    public void Draw()
    {
        System.out.println("반지름이 "+this.Radius+"인 원입니다.");
    }

    @Override
    public double GetArea()
    {
        return (this.Radius * this.Radius * PI);
    }
}

class Oval implements Shape
{
    // 긴 반지름
    private double MajorRadius;

    // 짧은 반지름
    private double MinorRadius;

    public Oval(double MajorRadius, double MinorRadius)
    {
        this.MajorRadius = MajorRadius;
        this.MinorRadius = MinorRadius;
    }

    @Override
    public void Draw()
    {
        System.out.println(this.MajorRadius+"x"+this.MinorRadius+"에 내접하는 타원입니다.");
    }

    @Override
    public double GetArea()
    {
        // 타원의 넓이 : 긴 반지름 * 짧은 반지름 * pi
        return (this.MinorRadius * this.MajorRadius * PI);
    }
}

class Rect implements Shape
{
    private double X;
    private double Y;

    public Rect(double X, double Y)
    {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public void Draw()
    {
        System.out.println(this.X+"x"+this.Y+"크기의 사각형 입니다.");
    }


    @Override
    public double GetArea()
    {
        return (this.X * this.Y);
    }
}

public class Problem14
{
    public static void main(String [] args)
    {
        Shape [] List = new Shape[3];

        List[0] = new Circle(10);
        List[1] = new Oval(20,30);
        List[2] = new Rect(10,40);

        for(Shape shape : List)
        {
            shape.reDraw();
        }

        for(Shape shape : List)
        {
            System.out.println("면적은 "+shape.GetArea());
        }
    }
}
