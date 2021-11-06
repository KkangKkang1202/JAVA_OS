package chapter8.example.example1;

import java.io.*;

public class FileReaderEx
{
    public static void main(String [] args)
    {
        FileReader fileReader = null;

        try
        {
            fileReader = new FileReader("C:\\Windows\\system.ini");
            int character;

            while((character=fileReader.read()) != -1)
            {
                System.out.print((char)character);
            }

            fileReader.close();
        }
        catch(IOException e)
        {
            System.out.println("입출력 오류");
        }
    }
}
