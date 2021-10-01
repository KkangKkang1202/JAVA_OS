package chapter4.example.example11;

class Calc
{
    public static int Abs(int a)
    {
        return (a>0?a:-a);
    }

    public static int Max(int a, int b)
    {
        return (a>b?a:b);
    }

    public static int Min(int a, int b)
    {
        return (a<b?a:b);
    }
}

public class CalcEx
{
    public static void main(String [] args)
    {
        System.out.println(Calc.Abs(-5));
        System.out.println(Calc.Max(10,8));
        System.out.println(Calc.Min(-3,-8));
    }
}
