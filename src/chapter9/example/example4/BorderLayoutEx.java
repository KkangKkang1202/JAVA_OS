package chapter9.example.example4;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame
{
    public BorderLayoutEx()
    {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(30,20));
        c.add(new JButton("Calculate"),BorderLayout.CENTER);
        c.add(new JButton("Add"),BorderLayout.NORTH);
        c.add(new JButton("Sub"),BorderLayout.SOUTH);
        c.add(new JButton("Mul"),BorderLayout.EAST);
        c.add(new JButton("Div"),BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new BorderLayoutEx();
    }
}
