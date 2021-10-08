package chapter5.example.example7;

abstract class Calculator
{
    public abstract int Add(int a, int b);
    public abstract int Subtract(int a, int b);
    public abstract double Average(int [] a);
}

public class GoodCalc extends Calculator
{
    public int Add(int a, int b)
    {
        return (a+b);
    }

    public int Subtract(int a, int b)
    {
        return (a-b);
    }

    public double Average(int [] a)
    {
        double Sum = 0.0;
        for(int i : a)
        {
            Sum+=(double)i;
        }
        return Sum/(double)a.length;
    }

    public static void main(String [] args)
    {
        GoodCalc calc = new GoodCalc();
        System.out.println(calc.Add(2,3));
        System.out.println(calc.Subtract(2,3));
        System.out.println(calc.Average(new int [] {2,3,4,}));
    }
}
