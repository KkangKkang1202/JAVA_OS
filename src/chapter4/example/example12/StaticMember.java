package chapter4.example.example12;

import java.util.Scanner;

class CurrencyConverter
{
    private static double Rate;
    public static double toDollar(double Won)
    {
        return Won/Rate;
    }

    public static double toKWR(double Dollar)
    {
        return Dollar*Rate;
    }

    public static void SetRate(double rate)
    {
        Rate=rate;
    }
}

public class StaticMember
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double Rate=scanner.nextDouble();

        CurrencyConverter.SetRate(Rate);

        System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000));
        System.out.println("$100은 "+CurrencyConverter.toKWR(100));
    }
}
