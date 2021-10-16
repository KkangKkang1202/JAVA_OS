package chapter6.example.example8;

public class StringBufferEx
{
    public static void main(String [] args)
    {
        StringBuffer stringBuffer = new StringBuffer("This");

        stringBuffer.append(" is pencil");
        System.out.println(stringBuffer);

        stringBuffer.insert(7," my");
        System.out.println(stringBuffer);

        stringBuffer.replace(8,10,"your");
        System.out.println(stringBuffer);

        stringBuffer.delete(8,13);
        System.out.println(stringBuffer);

        stringBuffer.setLength(4);
        System.out.println(stringBuffer);
    }
}
