package chapter7.example.example9;

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

public class MyStack
{
    public static void main(String [] args)
    {
        GStack<String> stringGStack = new GStack<>();
        stringGStack.Push("Seoul");
        stringGStack.Push("Busan");
        stringGStack.Push("LA");

        for(int Index=0; Index < 3; Index++)
        {
            System.out.println(stringGStack.Pop());
        }

        GStack<Integer> integerGStack = new GStack<>();
        integerGStack.Push(1);
        integerGStack.Push(3);
        integerGStack.Push(5);

        for(int Index=0; Index < 3; Index++)
        {
            System.out.println(integerGStack.Pop());
        }
    }
}
