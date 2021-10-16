package chapter6.practice.problem2;

class Circle
{
    private int X;
    private int Y;
    private int Radius;

    public Circle(int X, int Y, int Radius)
    {
        this.X = X;
        this.Y = Y;
        this.Radius = Radius;
    }

    @Override
    public String toString()
    {
        return ("Circle("+this.X+","+this.Y+") 반지름"+this.Radius);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Circle)
        {
            Circle circle = (Circle)obj;
            if((this.X == circle.X) && (this.Y == circle.Y))
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

public class Problem2
{
    public static void main(String [] args)
    {
        Circle a = new Circle(2,3,5);
        Circle b = new Circle(2,3,30);
        System.out.println("원 a : "+a);
        System.out.println("원 b : "+b);
        if(a.equals(b))
        {
            System.out.println("같은 원");
        }
        else
        {
            System.out.println("서로 다른 원");
        }
    }
}
