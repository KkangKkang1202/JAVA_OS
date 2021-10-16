package chapter6.practice.problem12;

import java.util.InputMismatchException;
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


public class Problem12
{
    public static void main(String [] args)
    {
        boolean EndGameSign = false;

        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("겜블링 게임에 참여할 선수 숫자 >> ");
            int PersonCount = scanner.nextInt();

            Person [] people = new Person[PersonCount];
            for(int Index=0; Index < people.length; Index++)
            {
                System.out.print(Index+1+"번째 선수 이름 >> ");
                people[Index] = new Person();
                people[Index].EnterName();
            }

            while(true)
            {
                for(Person person : people)
                {
                    person.Game();
                    if(person.Winner())
                    {
                        System.out.println(  person.getPersonName()+"님이 이겼습니다!");
                        EndGameSign = true;
                        break;
                    }
                    else
                    {
                        System.out.println("  아쉽군요!");
                    }
                    System.out.println();
                }
                if(EndGameSign)
                {
                    break;
                }
            }
            scanner.close();
        }
        catch (InputMismatchException e)
        {
            System.out.println("잘못된 숫자 입력\n");
        }
    }
}
