package chapter2.practice.problem2;

import java.util.Scanner;

public class Problem2
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99) >> ");
        int Number = scanner.nextInt();

        int Units = Number % 10;  // 일의 자리 구하기
        int Tens = Number / 10;   // 십의 자리 구하기

        if(Units == Tens)
        {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else
        {
            System.out.println("10의 자리와 1의 자리가 다릅니다.");
        }
        scanner.close();
    }
}
