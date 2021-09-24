package chapter4.practice.problem8;

import java.util.Scanner;

class Phone
{
    private String Name;
    private String Tel;

    public Phone(String Name, String Tel)
    {
        this.Name = Name;
        this.Tel = Tel;
    }

    public void ShowInformation()
    {
        System.out.println(this.Name+"의 번호는 "+this.Tel+" 입니다.\n");
    }

    public String getName()
    {
        return (this.Name);
    }
}

public class Problem8
{
    public static void Set(Phone [] phones)
    {
        Scanner scanner = new Scanner(System.in);
        String Name;
        String Tel;

        for(int Index=0; Index<phones.length; Index++)
        {
            System.out.print("이름과 전화번호 (이름과 전화번호는 빈 칸없이 입력) >>> ");
            Name = scanner.next();
            Tel = scanner.next();

            phones[Index] = new Phone(Name,Tel);
        }

        System.out.println("저장되었습니다...\n");
    }

    public static void SearchingTel(Phone [] phones)
    {
        Scanner scanner = new Scanner(System.in);
        String Name;
        int Find;

        while(true)
        {
            Find = 0;
            System.out.print("검색할 이름 >> ");
            Name = scanner.next();
            if(Name.equals("그만"))
            {
                break;
            }
            else
            {
                for(Phone phone : phones)
                {
                    if(phone.getName().equals(Name))
                    {
                        phone.ShowInformation();
                        Find+=1;
                    }
                }
                if(Find == 0)
                {
                    System.out.println(Name+"이(는) 없습니다.\n");
               }
            }
        }
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int People = scanner.nextInt();

        Phone [] phones = new Phone[People];
        Set(phones);
        SearchingTel(phones);
        scanner.close();
    }
}
