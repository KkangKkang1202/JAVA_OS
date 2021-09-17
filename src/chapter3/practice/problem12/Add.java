package chapter3.practice.problem12;

public class Add
{
    public static void main(String [] args)
    {
        int Sum=0;
        int i=0;
        while(i< args.length)
        {
            try
            {
                Sum+=Integer.parseInt(args[i]);
            }
            catch(NumberFormatException ignored)
            {

            }
            finally
            {
                i++;
            }
        }
        System.out.println(Sum);
    }
}
