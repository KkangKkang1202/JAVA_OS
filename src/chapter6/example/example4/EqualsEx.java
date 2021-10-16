package chapter6.example.example4;

import chapter4.example.example2.Rectangle;

class Rect
{
    int Width;
    int Height;

    public Rect(int Width, int Height)
    {
        this.Width = Width;
        this.Height = Height;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Rect)
        {
            Rect rectangle = (Rect)obj;
            if(this.Width*this.Height == rectangle.Width* rectangle.Height)
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

public class EqualsEx
{
    public static void main(String [] args)
    {
        Rect a = new Rect(2,3);
        Rect b = new Rect(3,2);
        Rect c = new Rect(3,4);

        if(a.equals(b))
        {
            System.out.println("a is equal to b");
        }

        if(a.equals(c))
        {
            System.out.println("a is equal to c");
        }

        if(b.equals(c))
        {
            System.out.println("b is equal to c");
        }
    }
}
