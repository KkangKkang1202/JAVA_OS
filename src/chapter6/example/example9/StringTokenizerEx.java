package chapter6.example.example9;

import java.util.StringTokenizer;

public class StringTokenizerEx
{
    public static void main(String [] args)
    {
        StringTokenizer stringTokenizer = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
        while(stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
