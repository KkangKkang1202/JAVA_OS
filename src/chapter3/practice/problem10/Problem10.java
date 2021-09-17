package chapter3.practice.problem10;

public class Problem10
{
    public static void Initialize(int [][] Array)
    {
        for(int i=0; i<Array.length; i++)
        {
            for(int j=0; j<Array[i].length; j++)
            {
                Array[i][j]=0;
            }
        }
    }

    public static void InputArray(int [][] Array)
    {
        int count;
        for(count=1; count<=10; count++)
        {
            int i=(int)(Math.random()*4);
            int j=(int)(Math.random()*4);

            if(Array[i][j]==0)
            {
                Array[i][j]=(int)(Math.random()*9+1);
            }
            else
            {
                count--;
            }
        }
    }

    public static void PrintArray(int [][] Array)
    {
        for(int i=0; i<Array.length; i++)
        {
            for(int j=0; j<Array[i].length; j++)
            {
                System.out.print(Array[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        int [][] Array= new int[4][4];
        Initialize(Array);
        InputArray(Array);
        PrintArray(Array);
    }
}
