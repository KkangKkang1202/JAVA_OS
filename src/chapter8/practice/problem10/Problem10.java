package chapter8.practice.problem10;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Problem10
{
    public static void main(String [] args)
    {
        HashMap<String, String> phoneList = new HashMap<>();

        try
        {
            FileReader fileReader = new FileReader("C:\\Temp\\phones.txt");
            Scanner fileScanner = new Scanner(fileReader);

            while(fileScanner.hasNext())
            {
                String Name = fileScanner.next();
                String phoneNumber = fileScanner.next();

                phoneList.put(Name,phoneNumber);
            }

            fileReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        String Name = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 "+phoneList.size()+"개의 전화번호를 읽었습니다.");

        while(true)
        {
            System.out.print("이름 >> ");
            Name = scanner.next();
            if(Name.equals("그만"))
            {
                break;
            }

            if(phoneList.containsKey(Name))
            {
                System.out.println(phoneList.get(Name)+"\n");
            }
            else
            {
                System.out.println("찾는 이름이 없습니다.\n");
            }
        }

        scanner.close();
    }
}
