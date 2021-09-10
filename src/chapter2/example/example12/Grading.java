package chapter2.example.example12;

import java.util.Scanner;

public class Grading
{
    public static void main(String [] args)
    {
        char Grade;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100) : ");
        int Score = scanner.nextInt();

        if(Score>=90)
        {
            Grade = 'A';
        }
        else if(Score>=80)
        {
            Grade = 'B';
        }
        else if(Score>=70)
        {
            Grade = 'C';
        }
        else if(Score>=60)
        {
            Grade = 'D';
        }
        else
        {
            Grade = 'F';
        }

        System.out.println("학점은 "+Grade+"입니다.");

        scanner.close();
    }
}
