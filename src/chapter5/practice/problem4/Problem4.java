package chapter5.practice.problem4;

import java.util.Scanner;

abstract class Converter
{
    abstract protected double Convert(double Src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double Ratio;

    public void Run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString()+"을"+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요 >> ");
        double Val = scanner.nextDouble();
        double Res = Convert(Val);

        System.out.println("변환 결과: "+Res+getDestString()+"입니다.");
        scanner.close();
    }
}

class KmToMile extends Converter
{
    private String Src;
    private String Dest;

    public KmToMile(double Ratio)
    {
        this.Src = "Km";
        this.Dest = "Mile";
        this.Ratio = Ratio;
    }

    @Override
    public double Convert(double Src)
    {
        return (Src / this.Ratio);
    }

    @Override
    public String getSrcString()
    {
        return (this.Src);
    }

    @Override
    public String getDestString()
    {
        return (this.Dest);
    }

}

public class Problem4
{
    public static void main(String [] args)
    {
        KmToMile toMile = new KmToMile(1.6);
        toMile.Run();
    }
}
