package chapter3.practice.problem16;

import java.util.Scanner;

public class Problem16
{
    public static void main(String [] args)
    {
        String [] ComputerSelection = {"가위","바위","보"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
        while(true)
        {
            System.out.print("가위 바위 보! >> ");
            String Select=scanner.next();
            if(Select.equals("그만"))
            {
                break;
            }
            else
            {
                int ComputerSelect=(int)(Math.random()*3);
                System.out.print("사용자 = "+Select+", 컴퓨터 = "+ComputerSelection[ComputerSelect]+"  ,");
                if(ComputerSelection[ComputerSelect].equals("가위"))
                {
                    if(Select.equals("가위"))
                    {
                        System.out.println("비겼습니다.");
                    }
                    else if(Select.equals("바위"))
                    {
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else if(Select.equals("보"))
                    {
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                }
                else if(ComputerSelection[ComputerSelect].equals("바위"))
                {
                    if(Select.equals("가위"))
                    {
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                    else if(Select.equals("바위"))
                    {
                        System.out.println("비겼습니다.");
                    }
                    else if(Select.equals("보"))
                    {
                        System.out.println("사용자가 이겼습니다.");
                    }
                }
                else if(ComputerSelection[ComputerSelect].equals("보"))
                {
                    if(Select.equals("가위"))
                    {
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else if(Select.equals("바위"))
                    {
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                    else if(Select.equals("보"))
                    {
                        System.out.println("비겼습니다.");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("게임을 종료합니다...");
        scanner.close();
    }
}
