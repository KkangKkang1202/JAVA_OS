package chapter4.practice.problem10;

import java.util.Scanner;

class DictionaryApp
{
    private final static String [ ] Kor = {"사랑","아기","돈","미래","희망"};
    private final static String [ ] Eng = {"love","baby","money","future","hope"};

    public static String KorToEng(String Word)
    {
        for(int Index=0; Index<Kor.length; Index++)
        {
            if(Kor[Index].equals(Word))
            {
                return Eng[Index];
            }
        }
        return null;
    }
}

public class Problem10
{
    public static void StartDictionary()
    {
        System.out.println("한영 단어 검색 프로그램입니다.");
        String Word = null;

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("한글 단어 ? ");
            Word=scanner.next();

            if(Word.equals("그만"))
            {
                break;
            }

            if(DictionaryApp.KorToEng(Word)==null)
            {
                System.out.println(Word+"은(는) 저의 사전에 없습니다.\n");
            }
            else
            {
                System.out.println(Word+"은(는) "+DictionaryApp.KorToEng(Word)+"\n");
            }
        }
        scanner.close();
    }
    public static void main(String [] args)
    {
       StartDictionary();
    }
}
