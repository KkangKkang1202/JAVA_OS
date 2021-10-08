package chapter5.example.example6;

class Weapon
{
    protected int Fire()
    {
        return 1;
    }
}

class Cannon extends Weapon
{
    @Override
    protected int Fire()
    {
        return 10;
    }
}

public class Overriding
{
    public static void main(String [] args)
    {
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 "+weapon.Fire());

        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 "+weapon.Fire());
    }
}
