package chapter4.example.example10;

class Sample
{
    public int a;
    private int b;
    int c;
}

public class AccessEx
{
    public static void main(String[] args)
    {
        Sample aClass = new Sample();
        aClass.a=10;
        // aClass.b=10;
        aClass.c=10;

        System.out.println("aClass.b=10에서 오류가 난다. 왜냐하면,");
        System.out.println("멤버 b의 접근지정자는 private 여서, Sample 클래스 내부를 제외하곤,");
        System.out.println("외부에서 접근을 절대로 할 수 없다.");
    }
}
