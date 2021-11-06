package chapter9.example.example5;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame
{
    public GridLayoutEx()
    {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gridLayout = new GridLayout(4,2);
        gridLayout.setVgap(5);

        Container c = getContentPane();
        c.setLayout(gridLayout);
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));

        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));

        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));

        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new GridLayoutEx();
    }
}
