package chapter4.example.example9;

public class GarbageEx
{
    public static void main(String [] args)
    {
        String a=new String("Good");
        String b=new String("Bad");
        String c=new String("Normal");
        String d,e;
        a = null;
        d = c;
        c = null;

        System.out.println("원래 a가 Good 문자열을 가진 객체의 주소를 가지고 있었지만,");
        System.out.println("a에 NULL 을 대입함으로써, a가 어떤 객체도 가리키지 않는 상태가 되고,");
        System.out.println("기존에 a가 가리키던 객체는 가비지가 된다.");

    }
}
