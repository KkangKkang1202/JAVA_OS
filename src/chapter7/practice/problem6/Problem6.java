package chapter7.practice.problem6;

import java.util.HashMap;
import java.util.Scanner;

class Location
{
    private int Longitude;
    private int Latitude;

    public Location(int Longitude, int Latitude)
    {
        this.Longitude = Longitude;
        this.Latitude = Latitude;
    }

    @Override
    public String toString()
    {
        return (this.Longitude+"  "+this.Latitude+"\n");
    }
}

public class Problem6
{
    public static void ShowCity(HashMap<String,Location> Cities)
    {
        for(String CityName : Cities.keySet())
        {
            System.out.println(CityName+"  "+Cities.get(CityName));
        }
    }

    public static void SearchCity(HashMap<String,Location> Cities)
    {
        Scanner scanner = new Scanner(System.in);
        String CityName;
        while(true)
        {
            System.out.print("도시 이름 >> ");
            CityName = scanner.nextLine();
            if(CityName.equals("그만"))
            {
                break;
            }
            else
            {
                if(Cities.get(CityName)==null)
                {
                    System.out.println(CityName+"은(는) 없습니다.\n");
                }
                else
                {
                    System.out.println(CityName+"  "+Cities.get(CityName));
                }
            }
        }
    }

    public static void main(String [] args)
    {
        HashMap<String, Location> Cities = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("도시, 경도, 위도를 입력하세요.");

        for(int Count=0; Count < 4; Count++)
        {
            System.out.print(">> ");
            String CityName = scanner.next();
            int Longitude = scanner.nextInt();
            int Latitude = scanner.nextInt();

            Cities.put(CityName,new Location(Longitude,Latitude));
        }
        System.out.println("--------------------------\n");
        ShowCity(Cities);
        System.out.println("--------------------------");


        SearchCity(Cities);
    }
}
