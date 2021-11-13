package chapter10.example.example5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame
{
    private JLabel label = new JLabel("Hello");

    public MouseAdapterEx()
    {
        class MyMouseAdapter extends MouseAdapter
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                int x = e.getX();
                int y = e.getY();
                label.setLocation(x,y);
            }
        }

        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.addMouseListener(new MyMouseAdapter());

        container.setLayout(null);
        label.setSize(50,20);
        label.setLocation(30,30);
        container.add(label);

        setSize(250,250);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new MouseAdapterEx();
    }
}
