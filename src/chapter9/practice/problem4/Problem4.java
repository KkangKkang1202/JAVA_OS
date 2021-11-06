package chapter9.practice.problem4;

import java.awt.*;
import javax.swing.*;

public class Problem4 extends JFrame
{
    public Problem4()
    {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
                          Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY};

        container.setLayout(new GridLayout(1,10));

        for(int Index=0; Index < colors.length; Index++)
        {
            JButton jButton = new JButton(Integer.toString(Index));
            jButton.setBackground(colors[Index]);

            container.add(jButton);
        }

        setSize(1000,400);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new Problem4();
    }
}
