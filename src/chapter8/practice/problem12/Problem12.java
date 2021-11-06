package chapter8.practice.problem12;

import java.io.*;
import java.util.*;

public class Problem12
{
    public static void SearchWord(Scanner scanner, Vector<String> stringVector)
    {
        String toFind;
        int FindFlag;

        while(true)
        {
            FindFlag = 0;
            System.out.print("검색할 단어나 문장 >> ");
            toFind = scanner.next();

            if(toFind.equals("그만"))
            {
                System.out.println("프로그램을 종료합니다.\n");
                break;
            }

            for(int Index=0; Index < stringVector.size(); Index++)
            {
                String Found = stringVector.get(Index);
                if(Found.contains(toFind))
                {
                    FindFlag = 1;
                    System.out.println((Index+1)+": "+Found);
                }
            }

            if(FindFlag==1)
            {
                System.out.println();
            }
            else if(FindFlag == 0)
            {
                System.out.println("발견하지 못하였습니다.\n");
            }
        }
    }

    public static void main(String [] args)
    {
        FileReader fileReader = null;
        Vector<String> stringVector = null;
        Scanner fileScanner = null;
        Scanner scanner = null;

        String fileName = null;

        try
        {
            scanner = new Scanner(System.in);
            System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("대상 파일명 입력 >> ");

            fileName = scanner.next();
            File file = new File(fileName);

            fileReader = new FileReader(file);
            stringVector = new Vector<>();

            fileScanner = new Scanner(fileReader);
            String Line;
            while(fileScanner.hasNext())
            {
                Line = fileScanner.nextLine();
                stringVector.add(Line);
            }
            SearchWord(scanner,stringVector);

            scanner.close();
            fileScanner.close();
            fileReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
