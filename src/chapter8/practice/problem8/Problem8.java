package chapter8.practice.problem8;

import java.io.*;

public class Problem8
{
    public static void main(String [] args)
    {
        File file = new File("C:\\");

        File [] subfiles = file.listFiles();

        long bigFileSize = 0;
        File bigFile = null;

        for(int i=0; i < subfiles.length; i++)
        {
            File f = subfiles[i];
            if(!f.isFile())
            {
                continue;
            }

            long size = f.length();
            if(bigFileSize < size)
            {
                bigFileSize = size;
                bigFile = f;
            }
        }

        System.out.println("가장 큰 파일은 "+bigFile.getPath()+" "+bigFileSize+"바이트");
    }
}
