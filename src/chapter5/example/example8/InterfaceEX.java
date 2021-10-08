package chapter5.example.example8;

interface PhoneInterface
{
    int TIME_OIT = 10000;

    // abstract public 생략
    void SendCall();
    void ReceiveCall();
    default void Print_Logo()
    {
        System.out.println("**Phone**");
    }
}

class SamsungPhone implements PhoneInterface
{
    @Override
    public void SendCall()
    {
        System.out.println("띠리리리링");
    }

    @Override
    public void ReceiveCall()
    {
        System.out.println("전화가 왔습니다.");
    }

    public void Flash()
    {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class InterfaceEX
{
    public static void main(String [] args)
    {
        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.Print_Logo();
        samsungPhone.SendCall();
        samsungPhone.ReceiveCall();
        samsungPhone.Flash();
    }
}
