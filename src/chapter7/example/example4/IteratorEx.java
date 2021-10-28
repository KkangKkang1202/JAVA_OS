package chapter7.example.example4;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx
{
    public static void main(String [] args)
    {
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(5);
        vector.add(4);
        vector.add(-1);
        vector.add(2,100);

        Iterator<Integer> iterator = vector.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        int Sum = 0;
        iterator = vector.iterator();

        while(iterator.hasNext())
        {
            Sum += iterator.next();
        }

        System.out.println("벡터에 있는 정수의 합 : "+Sum);
    }
}
