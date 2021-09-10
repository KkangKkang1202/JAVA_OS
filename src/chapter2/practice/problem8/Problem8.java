package chapter2.practice.problem8;

import java.util.Scanner;

public class Problem8
{
    public static boolean inRect(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2 )
    {
        return (x >= rect_x1 && x <= rect_x2) && (y >= rect_y1 && y <= rect_y2);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 두 점 입력 >> ");

        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();

        System.out.print("두번째 두 점 입력 >> ");

        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();

        if(inRect(X1, Y1, 100,100,200,200))
        {
            System.out.println("두 직사각형은 충돌한다.");
        }
        else if(inRect(X2, Y2, 100, 100, 200, 200))
        {
            System.out.println("두 직사각형은 충돌한다.");
        }
        else if(inRect(100,200,X1,Y1,X2,Y2))
        {
            System.out.println("두 직사각형은 충돌한다.");
        }
        else if(inRect(200,100,X1,Y1,X2,Y2))
        {
            System.out.println("두 직사각형은 충돌한다.");
        }
        else
        {
            System.out.println("두 직사각형은 충돌하지 않는다.");
        }

        scanner.close();
    }
}
