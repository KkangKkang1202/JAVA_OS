package chapter8.example.example6;

import java.io.*;

public class FileInputStreamEx
{
    public static void main(String [] args)
    {
        byte [] bytes = new byte[6];

        try
        {
            FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\test.out");
            int n = 0, c;
            while((c = fileInputStream.read()) != -1)
            {
                bytes[n] = (byte)c;
                n++;
            }

            System.out.println("C:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for(byte b : bytes)
            {
                System.out.print(b+" ");
            }
            System.out.println();
            fileInputStream.close();
        }
        catch (IOException e)
        {
            System.out.println("C\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요.");
        }
    }
}
