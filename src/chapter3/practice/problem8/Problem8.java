package chapter3.practice.problem8;

import java.util.Scanner;

public class Problem8
{
    public static void PrintArray(int [] Array)
    {
        int Count=1;
        for (int Value : Array)
        {
            System.out.print(Value + " ");
            if (Count % 9 == 0)
            {
                System.out.println();
            }
            Count++;
        }
    }

    public static void InputRandomNumbers(int [] Array)
    {
        for(int Index=0; Index<Array.length; Index++)
        {
            Array[Index]=(int)(Math.random()*100)+1;
            for(int j=0; j<Index; j++)
            {
                if(Array[Index]==Array[j])
                {
                    Index--;
                    break;
                }
            }
        }
    }

    public static void main(String [ ] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개? ");
        int Size=scanner.nextInt();
        int [] Array = new int[Size];
        InputRandomNumbers(Array);
        PrintArray(Array);
        scanner.close();
    }
}
