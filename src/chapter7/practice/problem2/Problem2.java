package chapter7.practice.problem2;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem2
{
    public static double CalGrade(ArrayList<String> arrayList)
    {
        double Sum = 0.0;
        double Average = 0.0;

        for(String grade : arrayList)
        {
            if(grade.equals("A"))
            {
                Sum+=4.0;
            }
            else if(grade.equals("B"))
            {
                Sum+=3.0;
            }
            else if(grade.equals("C"))
            {
                Sum+=2.0;
            }
            else if(grade.equals("D"))
            {
                Sum+=1.0;
            }
            else if(grade.equals("F"))
            {
                Sum+=0.0;
            }
        }

        Average = Sum/6.0;
        return (Average);
    }

    public static void Print_Menu()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");

        for(int Index=0; Index < 6; Index++)
        {
            arrayList.add(scanner.next());
        }

        System.out.println(CalGrade(arrayList));
        scanner.close();
    }

    public static void main(String [] args)
    {
        Print_Menu();
    }
}
