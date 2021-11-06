package chapter8.practice.problem6;

import java.io.*;
import java.util.Scanner;


public class Problem6
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String f1, f2;

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫 번째 파일 이름을 입력하세요. >> ");
        f1 = scanner.next();

        System.out.print("두 번째 파일 이름을 입력하세요. >> ");
        f2 = scanner.next();

        File file1 = new File(f1);
        File file2 = new File(f2);
        File AppendedFile = new File("C:\\Temp\\appended.txt");

        int c;

        try
        {
            FileInputStream fileInputStream1 = new FileInputStream(file1);
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            FileOutputStream fileOutputStream = new FileOutputStream(AppendedFile);

            while((c=fileInputStream1.read())!=-1)
            {
                fileOutputStream.write((char)c);
            }

            while((c=fileInputStream2.read())!=-1)
            {
                fileOutputStream.write((char)c);
            }

            System.out.println(AppendedFile.getPath()+"파일에 저장하였습니다.");

            fileInputStream1.close();
            fileInputStream2.close();
            fileOutputStream.close();
            scanner.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
