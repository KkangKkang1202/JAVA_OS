package chapter6.practice.problem6;

import java.util.Calendar;
import java.util.Scanner;

class TimeGame
{
    private String User_Name;
    private int Before_Second;
    private int After_Second;
    private Scanner scanner;
    private String EnterEvent;
    private int Duration;

    public static void Time_Comparison(TimeGame t1, TimeGame t2)
    {
        int NearTen1 = Math.abs(10-t1.Duration);
        int NearTen2 = Math.abs(10-t2.Duration);

        if(NearTen1 > NearTen2)
        {
            System.out.println("승자는 "+t2.User_Name);
        }
        else if(NearTen1 < NearTen2)
        {
            System.out.println("승자는 "+t1.User_Name);
        }
        else
        {
            System.out.println("결과가 동일합니다!");
        }
    }

    public TimeGame(String User_Name)
    {
        this.User_Name = User_Name;
        this.scanner = new Scanner(System.in);
    }

    private int GetSecond()
    {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(Calendar.SECOND));
    }

    private int GetDuration()
    {
        return (Math.abs(this.After_Second-this.Before_Second));
    }

    public void Print_Menu()
    {
        System.out.print(this.User_Name+" 시작 <Enter 키> >> ");
        EnterEvent = scanner.nextLine();
        Before_Second = GetSecond();
        System.out.println("    현재 초 시간 = "+Before_Second);
        System.out.print("10초 예상 후 <Enter 키> >> ");
        EnterEvent = scanner.nextLine();
        After_Second = GetSecond();
        System.out.println("    현재 초 시간 = "+After_Second);

        Duration = GetDuration();
    }

    public void ShowDuration()
    {
        System.out.print(this.User_Name+"의 결과 "+this.Duration+", ");
    }
}

public class Problem6
{
    public static void main(String [] args)
    {
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        TimeGame timeGame_Hwang = new TimeGame("황기태");
        timeGame_Hwang.Print_Menu();

        TimeGame timeGame_Lee = new TimeGame("이재문");
        timeGame_Lee.Print_Menu();

        timeGame_Hwang.ShowDuration();
        timeGame_Lee.ShowDuration();

        TimeGame.Time_Comparison(timeGame_Hwang,timeGame_Lee);
    }
}
