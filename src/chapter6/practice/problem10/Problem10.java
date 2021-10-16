package chapter6.practice.problem10;

import java.util.Scanner;

class Person
{
    private String PersonName;
    private int [] RandomNumber;
    private Scanner scanner;
    private String EnterEvent;

    public Person()
    {
        this.RandomNumber = new int[3];
        this.scanner = new Scanner(System.in);
    }

    public String getPersonName()
    {
        return (this.PersonName);
    }

    public boolean Winner()
    {
        if((RandomNumber[0] == RandomNumber[1]) && (RandomNumber[0] == RandomNumber[2]))
        {
            scanner.close();
           return (true);
        }
        return (false);
    }

    public void EnterName()
    {
        this.PersonName = scanner.nextLine();
    }

    public void Game()
    {
        System.out.print("["+this.PersonName+"] : <Enter>");
        EnterEvent = scanner.nextLine();
        System.out.print("        ");
        for(int Index=0; Index < RandomNumber.length; Index++)
        {
            RandomNumber[Index] = (int)(Math.random()*3)+1;
            System.out.print(RandomNumber[Index]+"  ");
        }
    }
}

public class Problem10
{
    public static void main(String [] args)
    {
        Person [] person = new Person[2];

        System.out.print("1번째 선수 이름 >> ");
        person[0] = new Person();
        person[0].EnterName();


        System.out.print("2번째 선수 이름 >> ");
        person[1] = new Person();
        person[1].EnterName();

        while(true)
        {
            person[0].Game();
            if(person[0].Winner())
            {
                System.out.println(  person[0].getPersonName()+"님이 이겼습니다!");
                break;
            }
            else
            {
                System.out.println("  아쉽군요!");
            }

            System.out.println();

            person[1].Game();
            if(person[1].Winner())
            {
                System.out.println(  person[1].getPersonName()+"님이 이겼습니다!");
                break;
            }
            else
            {
                System.out.println("  아쉽군요!");
            }

            System.out.println();
        }
    }
}
