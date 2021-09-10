package chapter2.practice.problem12_1;

import java.util.Scanner;

public class Problem12_1
{
    public static void main(String [] args)
    {
        String Operator;
        double Operand1;
        double Operand2;
        Scanner scanner = new Scanner(System.in);
        double Result;
        System.out.print("연산 >> ");

        Operand1 = scanner.nextDouble();
        Operator = scanner.next();
        Operand2 = scanner.nextDouble();

        //equals 메소드 -> Object 클래스의 멤버, String 클래스에서 재정의
        if(Operator.equals("+"))
        {
            Result = Operand1 + Operand2;
            System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
        }
        else if(Operator.equals("-"))
        {
            Result = Operand1 - Operand2;
            System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
        }
        else if(Operator.equals("*"))
        {
            Result = Operand1 * Operand2;
            System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
        }
        else if(Operator.equals("/"))
        {
            if(Operand2 == 0.0)
            {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else
            {
                Result = Operand1 / Operand2;
                System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
            }
        }
        else
        {
            System.out.println("알 수 없는 연산자. (+, -, *, / 만 입력하세요.)");
        }
        scanner.close();
    }
}
