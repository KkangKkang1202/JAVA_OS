package chapter4.example.example2;

import java.util.Scanner;

public class Rectangle
{
    int Width;
    int Height;

    public int getArea()
    {
        return (Width*Height);
    }

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");

        rectangle.Width = scanner.nextInt();
        rectangle.Height = scanner.nextInt();

        System.out.println("사각형의 면적은 "+rectangle.getArea());

        scanner.close();
    }
}
