package chapter5.example.example9;

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

interface MobilePhoneInterface extends PhoneInterface
{
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface
{
    void Play();
    void Stop();
}

class PDA
{
    public int Calculate(int x, int y)
    {
        return (x+y);
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
    @Override
    public void SendCall()
    {
        System.out.println("따르릉따르릉~~");
    }

    @Override
    public void ReceiveCall()
    {
        System.out.println("전화 왔어요.");
    }

    @Override
    public void sendSMS()
    {
        System.out.println("문자갑니다.");
    }

    @Override
    public void receiveSMS()
    {
        System.out.println("문자왔어요.");
    }

    @Override
    public void Play()
    {
        System.out.println("음악 연주합니다.");
    }

    @Override
    public void Stop()
    {
        System.out.println("음악 중단합니다.");
    }

    public void Schedule()
    {
        System.out.println("일정 관리합니다.");
    }
}
public class InterfaceEx
{
    public static void main(String [] args)
    {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.Print_Logo();
        smartPhone.SendCall();
        smartPhone.Play();
        System.out.println("3과 5를 더하면 "+smartPhone.Calculate(3,5));
        smartPhone.Schedule();
    }
}
