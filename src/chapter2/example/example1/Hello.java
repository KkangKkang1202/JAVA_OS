package chapter2.example.example1;

public class Hello
{
    public static int Sum(int n, int m)
    {
        return (n+m);
    }

    public static void main(String [] args)
    {
        int i=20;
        int s;
        char a;

        s = Sum(i,10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
