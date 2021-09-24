package chapter4.example.example7;

import java.util.Scanner;

class Book
{
    String Title, Author;
    public Book(String Title, String Author)
    {
        this.Title = Title;
        this.Author = Author;
    }
}

public class BookArray
{
    public static void main(String[] args)
    {
        Book [] books = new Book[2];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<books.length; i++)
        {
            System.out.print("제목 >> ");
            String Title = scanner.nextLine();
            System.out.print("저자 >> ");
            String Author = scanner.nextLine();
            books[i]=new Book(Title,Author);
        }

        for(int i=0; i< books.length; i++)
        {
            System.out.print("("+books[i].Title+", "+books[i].Author+")");
        }
    }
}
