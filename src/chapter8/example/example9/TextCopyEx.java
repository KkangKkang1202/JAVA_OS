package chapter8.example.example9;

import java.io.*;

public class TextCopyEx
{
    public static void main(String [] args)
    {
        File src = new File("C:\\Windows\\system.ini");
        File dest = new File("C:\\Temp\\system.txt");

        int character;
        try
        {
            FileReader fileReader = new FileReader(src);
            FileWriter fileWriter = new FileWriter(dest);

            while((character = fileReader.read())!=-1)
            {
                fileWriter.write((char)character);
            }
            fileReader.close();
            fileWriter.close();

            System.out.println(src.getPath()+"를 "+dest.getPath()+" 로 복사하였습니다.");
        }
        catch (IOException e)
        {
            System.out.println("파일 복사 오류");
        }
    }
}
