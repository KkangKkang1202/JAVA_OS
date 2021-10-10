package chapter5.practice.problem6;

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

class ColorPoint extends Point
{
    private String Color;

    public ColorPoint()
    {
        super(0,0);
        Color = "Black";
    }

    public ColorPoint(int X, int Y)
    {
        super(X, Y);
        Color = "Black";
    }

    public void setColor(String Color)
    {
        this.Color = Color;
    }

    public void setXY(int X, int Y)
    {
        this.Move(X, Y);
    }

    private String getXY()
    {
        return ("("+getX()+","+getY()+")");
    }

    // Object 클래스 멤버 함수인 toString() 재정의
    // (원래 객체의 정보를 출력하는 메소드임.)
    @Override
    public String toString()
    {
        return (this.Color+"색의 "+getXY()+"의 점");
    }
}

public class Problem6
{
    public static void main(String [] args)
    {
        ColorPoint zeroPoint = new ColorPoint();

        // println 메소드의 인자에 단 한 개의 참조변수(객체 가리키는)가 들어오면,
        // 참조변수가 가리키고 있는 객체의 toString()메소드를 자동호출 시킨다.
        System.out.println(zeroPoint+"입니다.");

        ColorPoint colorPoint = new ColorPoint(10,10);
        colorPoint.setXY(5,5);
        colorPoint.setColor("Red");
        System.out.println(colorPoint+"입니다.");
    }
}
