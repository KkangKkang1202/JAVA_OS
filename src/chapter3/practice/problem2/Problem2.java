package chapter3.practice.problem2;

public class Problem2
{
    public static void PrintArray(int [][] Array)
    {
        for(int i=0; i< Array.length; i++)
        {
            for(int j=0; j<Array[i].length; j++)
            {
                System.out.printf("%d ",Array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        int [][] Array = new int[][] {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
        PrintArray(Array);
    }
}
