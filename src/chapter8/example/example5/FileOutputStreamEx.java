package chapter8.example.example5;

import java.io.*;

public class FileOutputStreamEx
{
    public static void main(String [] args)
    {
        byte [] bytes = {7,51,3,4,-1,24};
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Temp\\test.out");

            for(byte b : bytes)
            {
                fileOutputStream.write(b);
            }

            fileOutputStream.close();
        }
        catch (IOException e)
        {
            System.out.println("C:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요.");
            return;
        }
        System.out.println("C:\\Temp\\test.out을 저장하였습니다.");
    }
}
