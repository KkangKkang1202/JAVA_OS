package chapter2.practice.problem4;

import java.util.Scanner;

public class Problem4
{
    public static void main(String [] args)
    {
        System.out.print("정수 3개 입력 >> ");
        Scanner scanner = new Scanner(System.in);
        int Number1 = scanner.nextInt();

        int Number2 = scanner.nextInt();

        int Number3 = scanner.nextInt();

        int Max, Min;

        int Sum = Number1 + Number2 + Number3;

        //최댓값 구하기
        Max = Number1;
        if(Number2 > Max)
        {
            Max = Number2;
        }
        if(Number3 > Max)
        {
            Max = Number3;
        }

        //최솟값 구하기
        Min = Number1;
        if(Number2 < Min)
        {
            Min = Number2;
        }
        if(Number3 < Min)
        {
            Min = Number3;
        }

        //중간값 구하기
        int Mid = Sum - Max - Min;
        System.out.println("중간 값은 "+Mid);
    }
}
