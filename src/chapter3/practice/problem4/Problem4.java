package chapter3.practice.problem4;

import java.util.Scanner;

public class Problem4
{
    public static void PrintAlphabet(char Alphabet)
    {
        int Total = (int)Alphabet - 97;
        for(int i=Total; i>=0; i--)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(j+97));
            }
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
        String s = scanner.next();

        char Alphabet = s.charAt(0);
        PrintAlphabet(Alphabet);
        scanner.close();
    }
}
