package chapter9.example.example6;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame
{
    public NullContainerEx()
    {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Hello, Press Buttons!");
        label.setLocation(130,50);
        label.setSize(200,20);
        c.add(label);

        for(int i=1; i<=9; i++)
        {
            JButton jButton = new JButton(Integer.toString(i));
            jButton.setLocation(i*15,i*15);
            jButton.setSize(50,20);
            c.add(jButton);
        }
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new NullContainerEx();
    }
}
