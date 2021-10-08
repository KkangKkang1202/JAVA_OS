package chapter5.example.example4;

class Person{}

class Student extends Person {}

class Researcher extends Person {}

class Professor extends Researcher {}

public class InstanceOfEx
{
    static void Print(Person person)
    {
        if(person instanceof Person)
        {
            System.out.print("Person ");
        }
        if(person instanceof Student)
        {
            System.out.print("Student ");
        }
        if(person instanceof Researcher)
        {
            System.out.print("Researcher ");
        }
        if(person instanceof  Professor)
        {
            System.out.print("Professor ");
        }
        System.out.println();
    }

    public static void main(String [] args)
    {
        System.out.print("new Student() -> \t");
        Print(new Student());

        System.out.print("new Researcher() -> \t");
        Print(new Researcher());

        System.out.print("new Professor() -> \t");
        Print(new Professor());
    }
}
