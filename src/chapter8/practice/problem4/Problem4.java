package chapter8.practice.problem4;

import javax.sound.sampled.Line;
import java.io.*;

public class Problem4
{
    public static void main(String [] args)
    {
        int LineNumber = 1;

        try
        {
            File file = new File("C:\\Windows\\system.ini");

            FileInputStream fileInputStream = new FileInputStream(file);

            System.out.println(file.getPath()+" 파일을 읽어 출력합니다.");

            int c;

            while((c=fileInputStream.read())!=-1)
            {
                if(LineNumber==1)
                {
                    System.out.printf("%4d: ", LineNumber);
                    LineNumber++;
                    continue;
                }
                System.out.print((char)c);

                if(c=='\n')
                {
                    System.out.printf("%4d: ",LineNumber);
                    LineNumber++;
                }
            }

            fileInputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
