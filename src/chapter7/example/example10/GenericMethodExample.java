package chapter7.example.example10;

class GStack<T>
{
    int Tos;
    Object [] Stack;

    public GStack()
    {
        this.Tos = 0;
        this.Stack = new Object[10];
    }

    public void Push(T item)
    {
        if(Tos == 10)
        {
            return;
        }
        this.Stack[Tos]=item;
        Tos++;
    }

    public T Pop()
    {
        if(Tos == 0)
        {
            return (null);
        }
        Tos--;
        return (T)Stack[Tos];
    }
}

public class GenericMethodExample
{
    public static <T> GStack<T> Reverse(GStack<T> a)
    {
        GStack<T> s = new GStack<>();
        while(true)
        {
            T temp;
            temp = a.Pop();
            if(temp == null)
            {
                break;
            }
            else
            {
                s.Push(temp);
            }
        }
        return s;
    }

    public static void main(String [] args)
    {
        GStack<Double> gStack = new GStack<>();

        for(int i=0; i<5; i++)
        {
            gStack.Push((double)i);
        }

        gStack = Reverse(gStack);
        for(int Index=0; Index < 5; Index++)
        {
            System.out.println(gStack.Pop());
        }
    }
}
