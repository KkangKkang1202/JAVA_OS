package chapter4.example.example1;

public class Circle
{
    int Radius;
    String Name;

    public Circle() {}

    public double getArea()
    {
        return (3.14*Radius*Radius);
    }

    public static void main(String [] args)
    {
        Circle Pizza;
        Pizza = new Circle();
        Pizza.Radius = 10;
        Pizza.Name = "자바피자";

        double Area = Pizza.getArea();
        System.out.println(Pizza.Name+"의 면적은 "+Area);

        Circle Donut = new Circle();
        Donut.Radius = 2;
        Donut.Name = "자바도넛";
        Area = Donut.getArea();
        System.out.println(Donut.Name+"의 면적은 "+Area);
    }
}
