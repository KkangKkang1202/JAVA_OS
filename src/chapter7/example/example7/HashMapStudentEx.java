package chapter7.example.example7;

import java.util.*;

class Student
{
    private int Id;
    private String Tel;

    public Student(int Id, String Tel)
    {
        this.Id = Id;
        this.Tel = Tel;
    }

    public int getId()
    {
        return (this.Id);
    }

    public String getTel()
    {
        return (this.Tel);
    }
}

public class HashMapStudentEx
{
    public static void main(String [] args)
    {
        HashMap<String,Student> hashMap = new HashMap<>();

        hashMap.put("황기태",new Student(1,"010-111-1111"));
        hashMap.put("이재문",new Student(2,"010-222-2222"));
        hashMap.put("김남윤",new Student(3,"010-333-3333"));

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("검색할 이름 ? : ");
            String Name = scanner.next();

            if(Name.equals("exit"))
            {
                break;
            }

            Student student = hashMap.get(Name);
            if(student == null)
            {
                System.out.println(Name+"은 없는 사람입니다.");
            }
            else
            {
                System.out.println("ID : "+student.getId()+", 전화 : "+student.getTel());
            }
        }
        scanner.close();
    }
}
