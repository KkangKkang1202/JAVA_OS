package chapter2.practice.problem10;

import java.util.Scanner;

public class Problem10
{
    public static void main(String [] args)
    {
        System.out.print("첫번째 원의 중심과 반지름 입력 >> ");

        Scanner scanner = new Scanner(System.in);

        double CenterX1;
        double CenterY1;
        double Radius1;

        CenterX1 = scanner.nextDouble();
        CenterY1 = scanner.nextDouble();
        Radius1 = scanner.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력 >> ");

        double CenterX2;
        double CenterY2;
        double Radius2;

        CenterX2 = scanner.nextDouble();
        CenterY2 = scanner.nextDouble();
        Radius2 = scanner.nextDouble();

        double CenterDistance;
        CenterDistance = Math.sqrt(((CenterX1 - CenterX2)*(CenterX1 - CenterX2))+((CenterY1-CenterY2)*(CenterY1-CenterY2)));
        double RadiusDistance = Radius1 + Radius2;


        //원이 겹치는지 확인하는 법 (좌표평면 상에서)
        //한 원의 중심과 다른 원의 중심사이의 거리가 두 반지름의 합보다 작으면 원이 겹친다.
        //반면, 중심사이의 거리가 두 반지름의 합보다 크거나 같으면 원이 겹치지 않는다.
        //(같으면 원이 겹치지 않게 만나고, 중심사이의 거리가 더 크면 원이 만나지 않는다.)
        if(CenterDistance < RadiusDistance)
        {
            System.out.println("두 원은 서로 겹친다.");
        }
        else
        {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }
        scanner.close();
    }
}
