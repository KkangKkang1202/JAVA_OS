package chapter4.practice.problem2;

import java.util.Scanner;

class Grade
{
    private int MathScore;
    private int ScienceScore;
    private int EnglishScore;


    public Grade(int MathScore, int ScienceScore, int EnglishScore)
    {
        this.MathScore = MathScore;
        this.ScienceScore = ScienceScore;
        this.EnglishScore = EnglishScore;
    }

    public int Average()
    {
        int Sum=this.MathScore+this.ScienceScore+this.EnglishScore;
        return (Sum/3);
    }
}

public class Problem2
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");

        int Math=scanner.nextInt();
        int Science=scanner.nextInt();
        int English=scanner.nextInt();

        Grade Me = new Grade(Math,Science,English);
        System.out.println("평균은 "+Me.Average());

        scanner.close();
    }
}
