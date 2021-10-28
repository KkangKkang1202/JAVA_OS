package chapter7.practice.problem4;

import java.util.Scanner;
import java.util.Vector;

public class Problem4
{
    public static int GetAverage(Vector<Integer> vector)
    {
        int Sum=0;
        for(Integer integer : vector)
        {
            Sum+=integer;
        }
        return (Sum/vector.size());
    }

    public static void main(String [] args)
    {
        Vector<Integer> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int Precipitation;

        while(true)
        {
            System.out.print("강수량 입력 (0입력시 종료) >> ");
            Precipitation = scanner.nextInt();
            if(Precipitation == 0)
            {
                break;
            }

            vector.add(Precipitation);

            for(Integer integer : vector)
            {
                System.out.print(integer+" ");
            }

            System.out.print("\n현재 평균 : "+GetAverage(vector));
            System.out.println("\n");
        }
    }
}
