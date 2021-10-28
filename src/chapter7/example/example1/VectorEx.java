package chapter7.example.example1;

import java.util.Vector;

public class VectorEx
{
    public static void main(String [ ] args)
    {
        Vector<Integer> vector = new Vector<>();

        vector.add(5);
        vector.add(4);
        vector.add(-1);

        vector.add(2,100);

        System.out.println("벡터 내의 요소 객체 수 : "+vector.size());
        System.out.println("벡터의 현재 용량 : "+vector.capacity());

        for(Integer integer : vector)
        {
            System.out.println(integer);
        }

        int Sum = 0;
        for(int Index=0; Index < vector.size(); Index++)
        {
            int Number = vector.elementAt(Index);
            Sum += Number;
        }

        System.out.println("벡터에 있는 정수의 합 : "+Sum);
    }
}
