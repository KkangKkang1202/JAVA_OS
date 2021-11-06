package chapter8.example.example4;

import java.io.*;
import java.util.*;

public class FileWriterEx
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;
        int character;

        try
        {
            fileWriter = new FileWriter("C:\\Temp\\test.txt");
            while(true)
            {
                String Line = scanner.nextLine();
                if(Line.length() == 0)
                {
                    break;
                }
                fileWriter.write(Line, 0, Line.length());
                fileWriter.write("\r\n", 0, 2);
            }

            fileWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
