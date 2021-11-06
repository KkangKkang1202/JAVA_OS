package chapter9.example.example3;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame
{
    public FlowLayoutEx()
    {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
        c.add(new JButton("Add"));
        c.add(new JButton("Sub"));
        c.add(new JButton("Mul"));
        c.add(new JButton("Div"));
        c.add(new JButton("Calculate"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new FlowLayoutEx();
    }
}
