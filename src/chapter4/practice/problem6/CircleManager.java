package chapter4.practice.problem6;

import java.util.Scanner;

class Circle
{
    private double x;
    private double y;
    private int Radius;

    public Circle(double x, double y, int Radius)
    {
        this.x = x;
        this.y = y;
        this.Radius = Radius;
    }

    public void Show()
    {
        System.out.println("("+this.x+" , "+this.y+") "+this.Radius);
    }

    public int ReturnArea()
    {
        return (this.Radius*this.Radius);
    }
}

public class CircleManager
{
    public static void PrintMaxAreaCircle(Circle [] circles)
    {
        int MaxArea = circles[0].ReturnArea();
        int Found=0;
        for(int Index=1; Index<circles.length; Index++)
        {
            if(circles[Index].ReturnArea()>MaxArea)
            {
                MaxArea = circles[Index].ReturnArea();
                Found=Index;
            }
        }
        System.out.print("\n가장 면적이 큰 원은 ");
        circles[Found].Show();
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Circle [] Circles = new Circle[3];
        for(int Index=0; Index<Circles.length; Index++)
        {
            System.out.print("x, y, Radius >> ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int Radius = scanner.nextInt();

            Circles[Index] = new Circle(x,y,Radius);
        }

        System.out.println();

        for(Circle circle : Circles)
        {
            circle.Show();
        }
        PrintMaxAreaCircle(Circles);
    }
}
