package chapter10.example.example4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame
{
    private JLabel label = new JLabel("Hello");

    public MouseListenerEx()
    {
        class MyMouseListener implements MouseListener
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                int x = e.getX();
                int y = e.getY();
                label.setLocation(x,y);
            }

            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}

        }
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.addMouseListener(new MyMouseListener());

        container.setLayout(null);
        this.label.setSize(50,20);
        this.label.setLocation(30,30);
        container.add(this.label);

        setSize(250,250);
        setVisible(true);

    }

    public static void main(String [] args)
    {
        new MouseListenerEx();
    }
}


