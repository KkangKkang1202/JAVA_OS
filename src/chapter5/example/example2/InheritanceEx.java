package chapter5.example.example2;

class Person
{
    private int Weight;
    int age;
    protected int Height;
    public String Name;

    public void setWeight(int Weight)
    {
        this.Weight = Weight;
    }

    public int getWeight()
    {
        return (this.Weight);
    }
}

class Student extends Person
{
    public void set()
    {
        age = 30;
        Name = "홍길동";
        Height=175;
        //weight = 99; -> 오류가 난다. 왜냐하면 접근지정자가 private 여서, 부모클래스 내부에서만 접근가능하다.
        setWeight(99);
    }

    // 예제에 없는 코드 (따로 추가)
    public void showInfo()
    {
        System.out.println(age+"\n"+Name+"\n"+Height+"\n"+getWeight());
    }
}

public class InheritanceEx
{
    public static void main(String [] args)
    {
        Student student = new Student();
        student.set();
        student.showInfo();
    }
}
