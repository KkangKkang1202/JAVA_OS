package chapter2.example.example14;

import java.util.Scanner;

public class GradingSwitch
{
    public static void main(String [] args)
    {
        char Grade;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100): ");
        int Score = scanner.nextInt();

        switch(Score/10)
        {
            case 10,9:
                Grade = 'A';
                break;
            case 8:
                Grade = 'B';
                break;
            case 7:
                Grade = 'C';
                break;
            case 6:
                Grade = 'D';
                break;
            default:
                Grade = 'F';
                break;
        }
        System.out.println("학점은 "+Grade+"입니다.");
        scanner.close();
    }
}
