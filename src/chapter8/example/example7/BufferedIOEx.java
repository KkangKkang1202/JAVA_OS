package chapter8.example.example7;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx
{
    public static void main(String [] args)
    {
        FileReader fileReader = null;
        int character;

        try
        {
            fileReader = new FileReader("C:\\Temp\\test2.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out,5);

            while((character = fileReader.read()) != -1)
            {
                bufferedOutputStream.write(character);
            }

            new Scanner(System.in).nextLine();
            bufferedOutputStream.flush();
            fileReader.close();
            bufferedOutputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
