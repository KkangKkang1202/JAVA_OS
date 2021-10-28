package chapter7.example.example6;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapScoreEx
{
    public static void main(String [] args)
    {
        HashMap<String, Integer> JavaScore = new HashMap<>();

        JavaScore.put("김성동",97);
        JavaScore.put("황기태",88);
        JavaScore.put("김남윤",98);
        JavaScore.put("이재문",70);
        JavaScore.put("한원선",99);

        System.out.println("HashMap 의 요소 개수 : "+JavaScore.size());

        Iterator<String> iterator = JavaScore.keySet().iterator();

        while(iterator.hasNext())
        {
            String Name = iterator.next();
            System.out.println(Name+" : "+JavaScore.get(Name));
        }
    }
}
