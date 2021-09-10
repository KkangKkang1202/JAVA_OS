package chapter2.practice.problem6;

import java.util.Scanner;

public class Problem6
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ~ 99사이의 정수를 입력하시오 >> ");

        int Number = scanner.nextInt();

        int Units = Number % 10;  // 10의 자리 구하기
        int Tens = Number / 10;  // 1의 자리 구하기

        if(Tens % 3 == 0)  // 만약 10의 자리가 3의 배수라면,
        {
            if(Units % 3 == 0)  // 만약 1의 자리가 3의 배수라면,
            {
                System.out.println("박수짝짝");
            }
            else
            {
                System.out.println("박수짝");
            }
        }
        else
        {
            if(Units % 3 ==0)  // 만약 1의 자리가 3의 배수라면
            {
                System.out.println("박수짝");
            }
            else
            {
                System.out.println(Number);
            }
        }
    }
}
