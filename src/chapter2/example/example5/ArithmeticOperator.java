package chapter2.example.example5;

import java.util.Scanner;

public class ArithmeticOperator
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");

        int Time = scanner.nextInt();

        int Second = Time%60;
        int Minute = (Time/60)%60;
        int Hour = (Time/60)/60;

        System.out.print(Time+"초는 ");
        System.out.print(Hour+"시간, ");
        System.out.print(Minute+"분, ");
        System.out.print(Second+"초입니다.");

        scanner.close();
    }
}
