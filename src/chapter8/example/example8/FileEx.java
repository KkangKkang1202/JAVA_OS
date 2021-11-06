package chapter8.example.example8;

import java.io.File;

public class FileEx
{
    public static void ListDirectory(File dir)
    {
        System.out.println("-----"+dir.getPath()+"의 서브 리스트입니다.-----");
        File [] subFiles = dir.listFiles();

        for(int i=0; i < subFiles.length; i++)
        {
            File file = subFiles[i];
            long t = file.lastModified();
            System.out.print(file.getName());
            System.out.print("\t파일 크기: "+file.length());
            System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",t,t,t,t);
        }
    }

    public static void main(String [] args)
    {
        File f1 = new File("C:\\Windows\\system.ini");
        System.out.println(f1.getPath()+","+f1.getParent()+","+f1.getName());

        String res = null;
        if(f1.isFile())
        {
            res = "파일";
        }
        else if(f1.isDirectory())
        {
            res = "디렉토리";
        }
        System.out.println(f1.getPath()+"은 "+res+"입니다.");

        File f2 = new File("C:\\Temp\\javasample");
        if(!f2.exists())
        {
            f2.mkdir();
        }
        ListDirectory(new File("C:\\Temp"));
        f2.renameTo(new File("C:\\Temp\\javaSample"));
        ListDirectory(new File("C:\\Temp"));
    }
}
