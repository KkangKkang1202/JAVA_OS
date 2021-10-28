package chapter7.example.example3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx
{
    public static void main(String [] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for(int Index=0; Index < 4; Index++)
        {
            System.out.print("이름을 입력하세요 >> ");
            String string = scanner.next();
            arrayList.add(string);
        }

        for (String Name : arrayList)
        {
            System.out.print(Name + " ");
        }

        int LongestIndex = 0;
        for(int i=1; i<arrayList.size(); i++)
        {
            if(arrayList.get(LongestIndex).length() < arrayList.get(i).length())
            {
                LongestIndex = i;
            }
        }

        System.out.println("\n가장 긴 이름은 : "+arrayList.get(LongestIndex));
        scanner.close();
    }
}
