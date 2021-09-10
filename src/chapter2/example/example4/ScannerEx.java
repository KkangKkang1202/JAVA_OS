package chapter2.example.example4;

import java.util.Scanner;

public class ScannerEx
{
    public static void main(String [] args)
    {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String Name = scanner.next();
        System.out.println("이름은 "+Name+",");

        String City = scanner.next();
        System.out.println("도시는 "+City+",");

        int Age = scanner.nextInt();
        System.out.println("나이는 "+Age+"살, ");

        double Weight = scanner.nextDouble();
        System.out.println("체중은 "+Weight+"kg, ");

        boolean Single = scanner.nextBoolean();
        System.out.println("독신 여부는 "+Single+"입니다.");

        scanner.close();
    }
}
