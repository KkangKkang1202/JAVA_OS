package chapter7.example.example5;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx
{
    public static void main(String[] args)
    {
        HashMap<String, String> dic = new HashMap<>();

        dic.put("Baby","아기");
        dic.put("Love","사과");
        dic.put("Apple","사과");

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("찾고 싶은 단어는 ? ");
            String English = scanner.next();

            if(English.equals("exit"))
            {
                System.out.println("종료합니다....");
                break;
            }

            String Korean = dic.get(English);
            if(Korean == null)
            {
                System.out.println(English+"는 없는 단어입니다.");
            }
            else
            {
                System.out.println(Korean);
            }
        }
        scanner.close();
    }
}
