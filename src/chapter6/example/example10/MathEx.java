package chapter6.example.example10;

public class MathEx
{
    public static void main(String [] args)
    {
        System.out.println(Math.PI);
        System.out.println(Math.ceil(Math.PI));
        System.out.println(Math.floor(Math.PI));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.exp(2));  // exp(2) => e^2
        System.out.println(Math.round(3.14));

        System.out.print("이번주 행운의 번호는 ");
        for(int i=0; i<5; i++)
        {
            System.out.print((int)(Math.random()*45+1)+" ");  // (0 ~ 45) +1 = (1 ~ 46)
        }
    }
}
