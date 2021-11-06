package chapter8.example.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulFail
{
    public static void main(String [] args)
    {
        InputStreamReader inputStreamReader = null;
        FileInputStream fileInputStream = null;

        try
        {
            fileInputStream = new FileInputStream("C:\\Temp\\hangul.txt");
            inputStreamReader = new InputStreamReader(fileInputStream,"US-ASCII");
            int character;

            System.out.println("인코딩 문자 집합은 "+inputStreamReader.getEncoding());
            while((character = inputStreamReader.read()) != -1)
            {
                System.out.print((char)character);
            }

            inputStreamReader.close();
            fileInputStream.close();
        }
        catch (IOException e)
        {
            System.out.println("입출력 오류");
        }
    }
}
