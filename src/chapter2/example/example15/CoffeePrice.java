package chapter2.example.example15;

import java.util.Scanner;

public class CoffeePrice
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("무슨 커피 드릴까요? : ");
        String Order = scanner.next();

        int Price = 0;

        switch(Order)
        {
            case "에스프레소","카푸치노","카페라떼":
                Price = 3500;
                break;
            case "아메리카노":
                Price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다!");
                break;
        }

        if(Price!=0)
        {
            System.out.print(Order+"는 "+Price+"원입니다.");
        }
        scanner.close();
    }
}
