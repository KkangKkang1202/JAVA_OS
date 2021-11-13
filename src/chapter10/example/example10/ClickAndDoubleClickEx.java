package chapter10.example.example10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickAndDoubleClickEx extends JFrame
{
    public ClickAndDoubleClickEx()
    {
        setTitle("Click and DoubleClick 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        class MyMouseListener extends MouseAdapter
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                {
                    int r = (int)(Math.random()*256);
                    int g = (int)(Math.random()*256);
                    int b = (int)(Math.random()*256);
                    Component component = (Component)e.getSource();
                    component.setBackground(new Color(r,g,b));
                }
            }
        }

        container.addMouseListener(new MyMouseListener());
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new ClickAndDoubleClickEx();
    }
}
