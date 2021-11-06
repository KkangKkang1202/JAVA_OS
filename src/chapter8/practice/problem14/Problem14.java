package chapter8.practice.problem14;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem14
{
    public static void main(String [] args)
    {
        File file = new File("C:\\");
        File [] subfiles;
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** 파일 탐색기입니다. *****");
        while(true)
        {
            String currentPath = file.getPath();
            System.out.println("["+currentPath+"]");
            subfiles = file.listFiles();

            for(int i=0; i < subfiles.length; i++)
            {
                String dir;
                if(subfiles[i].isDirectory())
                {
                    dir = "dir";
                }
                else
                {
                    dir = "file";
                }

                System.out.println(dir+"\t"+subfiles[i].length()+"바이트\t"+subfiles[i].getName());
            }
            System.out.print(">> ");
            String Line = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(Line," ");
            String Order = stringTokenizer.nextToken();

            if(Order.equals("그만"))
            {
                break;
            }

            if(Order.equals(".."))
            {
                if(file.getParent()==null)
                {
                    continue;
                }
                else
                {
                    file = new File(file.getParent());
                }
            }
            else
            {
                if(Order.equals("rename"))
                {

                   try
                   {
                       String name1, name2;
                       name1 = stringTokenizer.nextToken();
                       name2 = stringTokenizer.nextToken();

                       File file1 = new File(file, name1);
                       File file2 = new File(file, name2);

                       if(file2.exists())
                       {
                           System.out.println("이미 존재하는 이름입니다...");
                       }
                       else
                       {
                           file1.renameTo(file2);
                           System.out.println("파일명을 변경하였습니다.");
                       }
                   }
                   catch (Exception e)
                   {
                       System.out.println("두개의 파일명이 주어지지 않았습니다. !");
                   }
                }

                else if(Order.equals("mkdir"))
                {
                    try
                    {
                        String name = stringTokenizer.nextToken();
                        File newFile = new File(file, name);

                        if(newFile.exists())
                        {
                            System.out.println("이미 존재하는 디렉토리 입니다...");
                        }
                        else
                        {
                            System.out.println("디렉토리를 생성하였습니다.");
                            newFile.mkdir();
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("이름이 주어지지 않았습니다...");
                    }
                }

                else
                {
                    if(new File(file,Order).isDirectory())
                    {
                        file = new File(file,Order);
                    }
                    else
                    {
                        System.out.println("디렉토리가 아닙니다..\n");
                    }
                }
            }
        }

        scanner.close();
    }
}
