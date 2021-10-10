package chapter5.practice.problem10;

abstract class PairMap
{
    protected String [ ] KeyArray;
    protected String [ ] ValueArray;
    abstract String Get(String Key);
    abstract void Put(String Key, String Value);

    abstract String Delete(String Key);
    abstract int Length();
}

class Dictionary extends PairMap
{
    private int Dictionary_Size;
    private int NumberOfItems;

    public Dictionary(int Dictionary_Size)
    {
        this.Dictionary_Size = Dictionary_Size;
        this.KeyArray = new String[Dictionary_Size];
        this.ValueArray = new String[Dictionary_Size];
        this.NumberOfItems = 0;

        for(int Index=0; Index < KeyArray.length; Index++)
        {
            KeyArray[Index]="null__(No Key)";
            KeyArray[Index]="null__(No Value)";
        }
    }


    @Override
    public int Length()
    {
        int Length = NumberOfItems +1;
        return (Length);
    }

    private boolean CheckKeys(String Key)
    {
        for(int Index=0; Index < NumberOfItems; Index++)
        {
            if(KeyArray[Index].equals(Key))
            {
                return (true);
            }
        }
        return (false);
    }

    @Override
    public void Put(String Key, String Value)
    {

            if(CheckKeys(Key))
            {
                for(int Index=0; Index < NumberOfItems; Index++)
                {
                    if(KeyArray[Index].equals(Key))
                    {
                        ValueArray[Index]=Value;
                    }
                }
            }
            else
            {
                KeyArray[NumberOfItems] = Key;
                ValueArray[NumberOfItems] = Value;
                NumberOfItems++;
            }
    }

    @Override
    public String Get(String Key)
    {
        if(NumberOfItems==0)
        {
            return ("Dictionary에 어떤 아이템도 존재하지 않습니다.");
        }
        else
        {
            for(int Index=0; Index < this.NumberOfItems; Index++)
            {
                if(KeyArray[Index].equals(Key))
                {
                    return (this.ValueArray[Index]);
                }
            }
        }
        return null;
    }

    @Override
    public String Delete(String Key)
    {
        if(NumberOfItems==0)
        {
            return ("Dictionary에 어떤 아이템도 존재하지 않습니다.");
        }
        else
        {
            for(int Index=0; Index < this.NumberOfItems; Index++)
            {
                if(KeyArray[Index].equals(Key))
                {
                    String Deleted_Values = this.ValueArray[Index];
                    NumberOfItems--;
                    KeyArray[Index]="null__(No Key)";
                    ValueArray[Index]="null__(No Value)";
                    return Deleted_Values;
                }
            }
        }
        return null;
    }
}

public class Problem10
{
    public static void main(String [] args)
    {
        Dictionary dic = new Dictionary(10);
        dic.Put("황기태","자바");
        dic.Put("이재문","파이썬");
        dic.Put("이재문","C++");
        System.out.println("이재문의 값은 "+dic.Get("이재문"));
        System.out.println("황기태의 값은 "+dic.Get("황기태"));
        dic.Delete("황기태");
        System.out.println("황기태의 값은 "+dic.Get("황기태"));
    }
}
