package chapter4.example.example3;

public class Circle
{
    int Radius;
    String Name;

    public Circle()
    {
        Radius = 1;
        Name = "";
    }

    public Circle(int r, String n)
    {
        Radius = r;
        Name = n;
    }

    public double getArea()
    {
        return 3.14*Radius*Radius;
    }

    public static void main(String [] args)
    {
        Circle Pizza = new Circle(10,"자바피자");

        double Area = Pizza.getArea();
        System.out.println(Pizza.Name+"의 면적은 "+Area);

        Circle Donut = new Circle();
        Donut.Name = "도넛피자";
        Area = Donut.getArea();
        System.out.println(Donut.Name+"의 면적은 "+Area);
    }
}
