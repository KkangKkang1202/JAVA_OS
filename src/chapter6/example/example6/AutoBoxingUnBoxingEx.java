package chapter6.example.example6;

public class AutoBoxingUnBoxingEx
{
    public static void main(String [] args)
    {
        int n = 10;
        Integer intObject = n; // Boxing
        System.out.println("intObject = "+intObject);

        int m = intObject + 10;  // Unboxing
        System.out.println("m = "+m);
    }
}
