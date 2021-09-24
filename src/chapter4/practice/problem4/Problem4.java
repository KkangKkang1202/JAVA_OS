package chapter4.practice.problem4;

class Rectangle
{
    private int x;
    private int y;
    private int Height;
    private int Width;

    public Rectangle(int x, int y, int Width, int Height)
    {
        this.x = x;
        this.y = y;
        this.Width = Width;
        this.Height = Height;
    }

    public int Square()
    {
        return (this.Width*this.Height);
    }

    public void Show()
    {
        System.out.println("("+this.x+","+this.y+") 에서 크기가 "+this.Width+"x"+this.Height+"인 사각형");
    }

    public boolean Contain(Rectangle r)
    {
        if((this.x < r.x) && (this.y < r.y))
        {
            return ((this.x + this.Width) > (r.x + r.Width)) && ((this.y + this.Height) > (r.y + r.Height));
        }
        else
        {
            return false;
        }
    }
}

public class Problem4
{
    public static void main(String [] args)
    {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.Show();
        System.out.println("s의 면적은 "+s.Square());
        if(t.Contain(r))
        {
            System.out.println("t는 r을 포함합니다.");
        }
        if(t.Contain(s))
        {
            System.out.println("t는 s를 포함합니다.");
        }
    }
}
