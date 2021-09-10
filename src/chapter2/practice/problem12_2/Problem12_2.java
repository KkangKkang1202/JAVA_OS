package chapter2.practice.problem12_2;

import java.util.Scanner;

public class Problem12_2
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

        switch(Operator)
        {
            case "+":
                Result = Operand1 + Operand2;
                System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
                break;
            case "-":
                Result = Operand1 - Operand2;
                System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
                break;
            case "*":
                Result = Operand1 * Operand2;
                System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
                break;
            case "/":
                if(Operand2 == 0.0)
                {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else
                {
                    Result = Operand1 / Operand2;
                    System.out.println(Operand1+" "+Operator+" "+Operand2+" 의 계산 결과는 "+Result);
                }
                break;
            default:
                System.out.println("알 수 없는 연산자. (+, -, *, / 만 입력하세요.)");
                break;
        }
        scanner.close();
    }
}
