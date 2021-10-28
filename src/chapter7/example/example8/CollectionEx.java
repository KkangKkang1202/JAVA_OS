package chapter7.example.example8;

import java.util.*;

public class CollectionEx
{
    public static void PrintList(LinkedList<String> linkedList)
    {
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext())
        {
            String E = iterator.next();
            String Separator;

            if(iterator.hasNext())
            {
                Separator = "->";
            }
            else
            {
                Separator = "\n";
            }
            System.out.print(E+Separator);
        }
    }

    public static void main(String [] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("트랜스포머");
        linkedList.add("스타워즈");
        linkedList.add("메트릭스");
        linkedList.add(0,"터미네이터");
        linkedList.add(2,"아바타");

        Collections.sort(linkedList);
        PrintList(linkedList);

        Collections.reverse(linkedList);
        PrintList(linkedList);

        int Index = Collections.binarySearch(linkedList,"아바타")+1;
        System.out.println("아바타는 "+Index+"번째 요소입니다.");
    }
}
