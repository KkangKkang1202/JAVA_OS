package chapter3.practice.problem6;

import java.util.Scanner;

public class Problem6
{
    public static void main(String [] args)
    {
        int [] Unit = {50000,10000,1000,500,100,50,10,1};
        int Money=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하십시오. >> ");
        Money=scanner.nextInt();

        for(int Index : Unit)
        {
            int Count=Money/Index;
            if(Count==0)
            {
                continue;
            }
            System.out.println(Index+"원 짜리 : "+Count+"개");
            Money=Money-(Index*Count);
        }
    }
}
