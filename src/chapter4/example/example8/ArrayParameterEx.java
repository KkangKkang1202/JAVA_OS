package chapter4.example.example8;

public class ArrayParameterEx
{
    static void ReplaceSpace(char [] a)
    {
        for(int Index=0; Index<a.length; Index++)
        {
            if(a[Index]==' ')
            {
                a[Index]=',';
            }
        }
    }

    static void PrintCharArray(char [] a)
    {
        for(char i:a)
        {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        char [] c={'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
        PrintCharArray(c);
        ReplaceSpace(c);
        PrintCharArray(c);
    }
}
