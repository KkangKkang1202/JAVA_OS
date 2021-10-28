package chapter7.practice.problem12;

import java.util.Scanner;
import java.util.Vector;
import java.util.InputMismatchException;

class Word
{
    private String English;
    private String Korean;

    public Word(String English, String Korean)
    {
        this.English = English;
        this.Korean = Korean;
    }

    public String getEnglish()
    {
        return (this.English);
    }

    public String getKorean()
    {
        return (this.Korean);
    }
}

class AnswerGenerator
{
    int [] MultipleChoice = {-1,-1,-1,-1};

    public AnswerGenerator(int Num, int Size)
    {
        int AnswerNumber = (int)(Math.random()*4);
        MultipleChoice[AnswerNumber] = Num;
        for(int Index=0; Index <4; Index++)
        {
            int n = (int)(Math.random()*Size);
            if(MultipleChoice[Index]==-1)
            {
                MultipleChoice[Index] = n;
            }
            else
            {
                continue;
            }

            for(int j=0; j<4; j++)
            {
                if(Index!= j && (MultipleChoice[j]==MultipleChoice[Index]))
                {
                    MultipleChoice[Index]=-1;
                    Index--;
                }
            }
        }
    }
}

class WordQuiz
{
    private Vector<Word> words;
    private Scanner scanner;
    private int Random;

    public WordQuiz()
    {
        this.words = new Vector<>();
        this.scanner = new Scanner(System.in);
    }

    public void PlayGame()
    {
        if(words.isEmpty())
        {
            System.out.println("단어가 존재하지 않습니다.\n");
        }
        else
        {
            int Answer;
            System.out.println("현재 "+words.size()+"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다. >>");
            while(true)
            {
                Random = (int)(Math.random()* words.size());
                String Example = words.get(Random).getEnglish();
                System.out.println(Example+"?");

                AnswerGenerator answerGenerator = new AnswerGenerator(Random,words.size());
                try
                {
                    for(int Index=0; Index < 4; Index++)
                    {
                        System.out.print("("+(Index+1)+")"+words.get(answerGenerator.MultipleChoice[Index]).getKorean()+" ");
                    }
                    System.out.print(" : ");
                    Answer = scanner.nextInt();
                    if(Answer==-1)
                    {
                        System.out.println("테스트를 종료합니다.");
                        break;
                    }
                    else if(answerGenerator.MultipleChoice[Answer-1] == Random)
                    {
                        System.out.println("Excellent !! \n");
                    }
                    else
                    {
                        System.out.println("No !!\n");
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("숫자를 입력하세요 !!\n");
                    String temp = scanner.next();
                }
            }
        }
    }

    public void PutWord()
    {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        String English, Korean;
        while(true)
        {
            System.out.print("영어 한글 입력 >> ");

            English = scanner.next();

            if(English.equals("그만"))
            {
                break;
            }

            Korean = scanner.next();

            this.words.add(new Word(English,Korean));
            System.out.println();
        }
    }

    public void PrintMenu()
    {
        int Selection;
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****\n\n");
        while(true)
        {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3 >> ");
            Selection = scanner.nextInt();
            if(Selection == 1)
            {
                PlayGame();
            }
            else if(Selection == 2)
            {
                PutWord();
            }
            else if(Selection == 3)
            {
                break;
            }
            else
            {
                System.out.println("1에서 3사이의 숫자만 입력하세요.\n");
            }
        }
    }
}

public class Problem12
{
    public static void main(String [] args)
    {
        WordQuiz wordQuiz = new WordQuiz();
        wordQuiz.PrintMenu();
    }
}
