package chapter5.practice.problem12;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape
{
    private Shape Next;
    public Shape()
    {
        this.Next = null;
    }
    public void setNext(Shape obj)
    {
        Next = obj;
    }
    public Shape getNext()
    {
        return Next;
    }
    public abstract void Draw();
}

class Line extends Shape
{
    private String ShapeName;
    public Line()
    {
        this.ShapeName = "Line";
    }

    @Override
    public void Draw()
    {
        System.out.println(this.ShapeName);
    }
}

class Rect extends Shape
{
    private String ShapeName;
    public Rect()
    {
        this.ShapeName = "Rect";
    }

    @Override
    public void Draw()
    {
        System.out.println(this.ShapeName);
    }
}

class Circle extends Shape
{
    private String ShapeName;
    public Circle()
    {
        this.ShapeName = "Circle";
    }
    @Override
    public void Draw()
    {
        System.out.println(this.ShapeName);
    }
}

class GraphicEditor
{
    public void Print_Menu()
    {
        System.out.println("그래픽 에디터 Beauty를 실행합니다.\n");

        int Select;
        Scanner scanner = new Scanner(System.in);

        Shape StartProgram = null;
        Shape forFind;
        Shape before=null;
        Shape newShape;

        while(true)
        {
            try
            {
                System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
                Select = scanner.nextInt();
                if(Select == 1)
                {
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    try
                    {
                        Select = scanner.nextInt();
                        if(Select == 1)
                        {
                            newShape = new Line();
                        }
                        else if(Select == 2)
                        {
                           newShape = new Rect();
                        }
                        else if(Select == 3)
                        {
                            newShape = new Circle();
                        }
                        else
                        {
                            System.out.println("1에서 3사이의 숫자만 입력하세요.");
                            continue;
                        }

                        if(StartProgram == null)
                        {
                            StartProgram = newShape;
                        }
                        else
                        {
                            forFind = StartProgram;
                            while(forFind.getNext() != null)
                            {
                                forFind = forFind.getNext();
                            }
                            forFind.setNext(newShape);
                        }
                    }
                    catch (InputMismatchException exception)
                    {
                        System.out.println("숫자만 입력하세요.");
                        scanner.next();
                    }
                }
                else if(Select == 2)
                {
                    int Count=1;
                    if(StartProgram==null)
                    {
                        System.out.println("어떤 도형도 존재하지 않습니다.\n\n");
                        continue;
                    }
                    System.out.print("삭제할 도형의 위치 >> ");
                    int Position = scanner.nextInt();
                    forFind = StartProgram;
                    while(forFind!=null)
                    {
                        if(Position==Count)
                        {
                            break;
                        }
                        before = forFind;
                        forFind = forFind.getNext();
                        Count++;
                    }
                    if(forFind == null)
                    {
                        System.out.println("삭제할 수 없습니다.");
                    }
                    else
                    {
                        if(Position==1)
                        {
                            StartProgram = forFind.getNext();
                        }
                        else
                        {
                            before.setNext(forFind.getNext());
                        }
                        System.out.println("삭제하였습니다.");
                    }
                }
                else if(Select == 3)
                {
                    if(StartProgram==null)
                    {
                        System.out.println("어떤 도형도 존재하지 않습니다.\n\n");
                        continue;
                    }
                    forFind = StartProgram;
                    while(forFind != null)
                    {
                        forFind.Draw();
                        forFind = forFind.getNext();
                    }
                }
                else if(Select == 4)
                {
                    System.out.println("Beauty를 종료합니다.\n\n");
                    scanner.close();
                    break;
                }
                else
                {
                    System.out.println("1에서 4사이의 숫자만 입력하세요.");
                }
            }
            catch (InputMismatchException exception)
            {
                System.out.println("숫자만 입력하세요.");
                scanner.next();
            }
            System.out.println("\n\n");
        }
    }
}

public class Problem12
{
    public static void main(String [] args)
    {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.Print_Menu();
    }
}
