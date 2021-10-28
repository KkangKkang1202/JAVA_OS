package chapter7.practice.problem8;

import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;

class PointManagementProgram
{
    private HashMap<String, Integer> Program;

    public PointManagementProgram()
    {
        this.Program = new HashMap<>();
    }

    public void AddClient(String ClientName, Integer ClientPoint)
    {
        if(this.Program.containsKey(ClientName))
        {
            int NewPoint = this.Program.get(ClientName) + ClientPoint;
            this.Program.put(ClientName,NewPoint);
        }
        else
        {
            this.Program.put(ClientName,ClientPoint);
        }
    }

    public void ShowClient()
    {
        Iterator<String> iterator = this.Program.keySet().iterator();
        while(iterator.hasNext())
        {
            String Name = iterator.next();
            Integer Point = this.Program.get(Name);
            System.out.print("("+Name+","+Point+")");
        }
        System.out.println();
    }

}

public class Problem8
{
    public static void main(String [] args)
    {
        PointManagementProgram pointManagementProgram = new PointManagementProgram();
        Scanner scanner = new Scanner(System.in);

        String ClientName;
        int ClientPoint;

        System.out.println("** 포인트 관리 프로그램입니다. **");
        while(true)
        {
            System.out.print("이름과 포인트 입력 >> ");
            ClientName = scanner.next();
            if(ClientName.equals("그만"))
            {
                break;
            }
            ClientPoint = scanner.nextInt();


            pointManagementProgram.AddClient(ClientName,ClientPoint);
            pointManagementProgram.ShowClient();

        }
    }
}
