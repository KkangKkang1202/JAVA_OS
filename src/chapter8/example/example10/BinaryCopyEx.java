package chapter8.example.example10;

import java.io.*;

public class BinaryCopyEx
{
    public static void main(String [] args)
    {
        File src = new File("C:\\Temp\\apple.png");
        File dest = new File("C:\\Temp\\javaSample\\appleCopy.png");

        int c;
        try
        {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);

            while((c = fileInputStream.read()) != -1)
            {
                fileOutputStream.write((byte)c);
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
        }
        catch (IOException e)
        {
            System.out.println("파일 복사 오류");
        }
    }
}
