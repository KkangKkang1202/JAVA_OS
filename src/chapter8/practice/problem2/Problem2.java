package chapter8.practice.problem2;

import java.io.*;

public class Problem2
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("C:\\Temp\\phone.txt");
            FileReader fileReader = new FileReader(file);
            int c;

            System.out.println(file.getPath()+"를 출력합니다.");
            while((c=fileReader.read())!=-1)
            {
                System.out.print((char)c);
            }

            fileReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
