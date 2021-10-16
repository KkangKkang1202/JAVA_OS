package chapter6.practice.problem8;

import java.util.Scanner;

public class Problem8
{
    public static void Print_Menu()
    {
        String Sentence = null;

        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        Scanner scanner = new Scanner(System.in);
        Sentence = scanner.nextLine();

        for(int Index=1; Index <= Sentence.length(); Index++)
        {
            System.out.print(Sentence.substring(Index));
            System.out.print(Sentence.substring(0,Index));  // 범위 : 0부터 Index -1 까지

            System.out.println();
        }

        scanner.close();
    }

    public static void main(String [] args)
    {
        Print_Menu();
    }
}
