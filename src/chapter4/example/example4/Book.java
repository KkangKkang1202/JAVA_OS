package chapter4.example.example4;

public class Book
{
    String Title;
    String Author;

    public Book(String t)
    {
        Title = t;
        Author = "작자미상";
    }

    public Book(String t, String a)
    {
        Title = t;
        Author = a;
    }

    public static void main(String[] args)
    {
        Book LittlePrince = new Book("어린왕자","생텍쥐페리");
        Book LoveStory = new Book("춘향전");
        System.out.println(LittlePrince.Title+" "+LittlePrince.Author);
        System.out.println(LoveStory.Title+" "+LoveStory.Author);
    }
}

