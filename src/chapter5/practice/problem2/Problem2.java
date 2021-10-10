package chapter5.practice.problem2;

class TV
{
    private int Size;
    public TV(int Size)
    {
        this.Size = Size;
    }

    protected int getSize()
    {
        return (this.Size);
    }
}

class ColorTV extends TV
{
    protected int Color;
    public ColorTV(int Size, int Color)
    {
        super(Size);
        this.Color = Color;
    }

    public void printProperty()
    {
        System.out.println(this.getSize()+"인치 "+this.Color+"컬러");
    }
}

class IPTV extends  ColorTV
{
    private String IP_Address;
    public IPTV(String IP_Address, int Size, int Color)
    {
        super(Size,Color);
        this.IP_Address = IP_Address;
    }

    @Override
    public void printProperty()
    {
        System.out.println("나의 IPTV는 "+this.IP_Address+" 주소의 "+this.getSize()+"인치 "+this.Color+"컬러");
    }
}

public class Problem2
{
    public static void main(String [] args)
    {
        IPTV iptv = new IPTV("192.1.1.2",32,2048);
        iptv.printProperty();
    }
}
