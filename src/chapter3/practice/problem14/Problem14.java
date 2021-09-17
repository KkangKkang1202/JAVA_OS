package chapter3.practice.problem14;

import java.util.Scanner;

public class Problem14
{
    public static void CourseAndScore(String [] Course, int [] Score)
    {
        Scanner scanner = new Scanner(System.in);
        int FindFlag=0;
        while(true)
        {
            FindFlag=0;
            System.out.print("과목 이름 >> ");
            String SubjectName;
            SubjectName=scanner.next();


            if(SubjectName.equals("그만"))
            {
                break;
            }
            else
            {
                for(int Index=0; Index < Course.length; Index++)
                {
                    if(SubjectName.equals(Course[Index]))
                    {
                        System.out.println(Course[Index]+"의 점수는 "+Score[Index]);
                        FindFlag++;
                    }
                }

                if(FindFlag==1)
                {
                    System.out.println();
                }
                else if(FindFlag==0)
                {
                    System.out.println("없는 과목입니다.\n");
                }
            }
        }
        scanner.close();
    }
    public static void main(String [] args)
    {
        String [] Course = new String[] {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int [] Score = new int[] {95,88,76,62,55};
        CourseAndScore(Course,Score);
    }
}
