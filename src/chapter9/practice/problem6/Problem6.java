package chapter9.practice.problem6;

import java.awt.*;
import javax.swing.*;

public class Problem6 extends JFrame
{
    public Problem6()
    {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        setSize(300,300);

        for(int count=0; count <20; count++)
        {
            JLabel jLabel = new JLabel();

            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;

            jLabel.setSize(10,10);
            jLabel.setLocation(x,y);
            jLabel.setBackground(Color.BLUE);
            jLabel.setOpaque(true);

            container.add(jLabel);
        }
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new Problem6();
    }
}
