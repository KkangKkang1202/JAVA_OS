package chapter7.practice.problem10;

import java.util.Scanner;
import java.util.Vector;
import java.util.InputMismatchException;

abstract class Shape
{
    abstract public void Draw();
}

class Line extends Shape
{
    private String ShapeName;

    public Line(String ShapeName)
    {
        this.ShapeName = ShapeName;
    }

    @Override
    public void Draw()
    {
        System.out.println(ShapeName);
    }
}

class Rect extends Shape
{
    private String ShapeName;

    public Rect(String ShapeName)
    {
        this.ShapeName = ShapeName;
    }

    @Override
    public void Draw()
    {
        System.out.println(ShapeName);
    }
}

class Circle extends Shape
{
    private String ShapeName;

    public Circle(String ShapeName)
    {
        this.ShapeName = ShapeName;
    }

    @Override
    public void Draw()
    {
        System.out.println(ShapeName);
    }
}

class GraphicEditor
{
    private Vector<Shape> shapeVector;
    private Scanner scanner;

    public GraphicEditor()
    {
        shapeVector = new Vector<>();
        scanner = new Scanner(System.in);
    }

    private void InsertShape(int Identifier)
    {
        if(Identifier == 1)
        {
            shapeVector.add(new Line("Line"));
        }
        else if(Identifier == 2)
        {
            shapeVector.add(new Rect("Rect"));
        }
        else if(Identifier == 3)
        {
            shapeVector.add(new Circle("Circle"));
        }
        System.out.println();
    }

    private void DeleteShape(int Index)
    {
        if(Index > shapeVector.size() || Index < 0)
        {
            System.out.println("삭제할 수 없습니다.\n");
        }
        else
        {
            shapeVector.remove(Index-1);
            System.out.println("삭제하였습니다.\n");
        }
    }

    private void ShowAllShape()
    {
        for(Shape shape : shapeVector)
        {
            shape.Draw();
        }
        System.out.println();
    }

    public void PrintMenu()
    {
        int Selection;
        int ShapeSelection;
        int DeleteIndex;

        System.out.println("그래픽 에디터 Beauty를 실행합니다.\n");
        while(true)
        {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            try
            {
                Selection = scanner.nextInt();
                if(Selection == 1)
                {
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    try
                    {
                        ShapeSelection = scanner.nextInt();
                        if(ShapeSelection == 1)
                        {
                            this.InsertShape(ShapeSelection);
                        }
                        else if(ShapeSelection == 2)
                        {
                            this.InsertShape(ShapeSelection);
                        }
                        else if(ShapeSelection == 3)
                        {
                            this.InsertShape(ShapeSelection);
                        }
                        else
                        {
                            System.out.println("1~3사이의 숫자만 입력해주세요.\n");
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("숫자만 입력해주세요.\n");
                    }
                }
                else if(Selection == 2)
                {
                    if(this.shapeVector.isEmpty())
                    {
                        System.out.println("도형이 존재하지 않습니다.\n");
                        continue;
                    }

                    System.out.print("삭제할 도형의 위치 >> ");
                    try
                    {
                        DeleteIndex = scanner.nextInt();
                        this.DeleteShape(DeleteIndex);
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("숫자만 입력해주세요.\n");
                    }
                }
                else if(Selection == 3)
                {
                    if(this.shapeVector.isEmpty())
                    {
                        System.out.println("도형이 존재하지 않습니다.\n");
                        continue;
                    }
                    this.ShowAllShape();
                }
                else if(Selection == 4)
                {
                    System.out.println("Beauty를 종료합니다.\n");
                    break;
                }
                else
                {
                    System.out.println("1~4사이의 숫자만 입력해주세요.\n");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("숫자만 입력하세요. \n");
            }
        }
        scanner.close();
    }
}

public class Problem10
{
    public static void main(String [] args)
    {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.PrintMenu();
    }
}
