package chapter8.example.example11;

import java.io.*;

public class BlockBinaryCopyEx
{
    public static void main(String [] args)
    {
        File src = new File("C:\\Temp\\apple.png");
        File dest = new File("C:\\Temp\\javaSample\\appleCopy2.png");

        try
        {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);

            byte [] buf = new byte[1024*10];
            while(true)
            {
                int n = fileInputStream.read(buf);
                fileOutputStream.write(buf,0,n);
                if(n < buf.length)
                {
                    break;
                }
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
