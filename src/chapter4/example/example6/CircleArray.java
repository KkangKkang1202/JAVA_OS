package chapter4.example.example6;

class Circle
{
    int Radius;

    public Circle(int Radius)
    {
        this.Radius = Radius;
    }

    public double getArea()
    {
        return (3.14*this.Radius*this.Radius);
    }
}

public class CircleArray
{
    public static void main(String[] args)
    {
        Circle [] circles = new Circle[5];
        for(int i=0; i<circles.length; i++)
        {
            circles[i] = new Circle(i);
        }

        for(int i=0; i< circles.length; i++)
        {
            System.out.print((int)(circles[i].getArea())+" ");
        }
    }
}
