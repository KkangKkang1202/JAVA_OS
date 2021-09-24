package chapter4.example.example5;

public class Book {
    String Title;
    String Author;

    public Book()
    {
        this("", "");
        System.out.println("생성자 호출됨.");
    }

    public Book(String Title)
    {
        this(Title, "작자미상");
    }

    public Book(String t, String a)
    {
        Title = t;
        Author = a;
    }

    void Show()
    {
        System.out.println(Title+" "+Author);
    }

    public static void main(String[] args)
    {
        Book LittlePrince = new Book("어린왕자", "생텍쥐페리리");
        Book LoveStory = new Book("Bible");
        Book EmptyBook = new Book();

        EmptyBook.Show();
        LoveStory.Show();
    }
}

