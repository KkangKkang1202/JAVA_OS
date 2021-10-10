package chapter5.practice.problem8;

class Point
{
    private int X;
    private int Y;

    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public int getX()
    {
        return (this.X);
    }

    public int getY()
    {
        return (this.Y);
    }

    protected void Move(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }
}

class PositivePoint extends Point
{
    public PositivePoint()
    {
        super(0,0);
    }

    public PositivePoint(int X, int Y)
    {
        super(X,Y);
        if(X < 0 || Y < 0)
        {
            super.Move(0,0);
        }
    }

    @Override
    public void Move(int X, int Y)
    {
        if(X < 0 || Y < 0)
        {
            return;
        }
        else
        {
            super.Move(X,Y);
        }
    }

    @Override
    public String toString()
    {
        return ("("+this.getX()+","+this.getY()+")의 점");
    }
}

public class Problem8
{
    public static void main(String [] args)
    {
        PositivePoint p = new PositivePoint();
        p.Move(10,10);
        System.out.println(p+"입니다.");

        p.Move(-5,5);
        System.out.println(p+"입니다.");

        PositivePoint p2 = new PositivePoint(-10,10);
        System.out.println(p2+"입니다.");
    }
}
