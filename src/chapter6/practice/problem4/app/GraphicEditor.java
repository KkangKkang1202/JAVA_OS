package chapter6.practice.problem4.app;

import chapter6.practice.problem4.base.Shape;
import chapter6.practice.problem4.derived.Circle;

public class GraphicEditor
{
    public static void main(String [] args)
    {
        Shape shape = new Circle();
        shape.Draw();
    }
}
