package chapter9.example.example1;

import javax.swing.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        setTitle("300 x 300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        MyFrame myFrame = new MyFrame();
    }
}
