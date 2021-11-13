package chapter10.practice.problem2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem2 extends JFrame
{
    public Problem2()
    {
        setTitle("드래깅동안 노란색으로 유지하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setBackground(Color.GREEN);

        class MyMouseListener extends MouseAdapter
        {
            @Override
            public void mouseDragged(MouseEvent e)
            {
                Container container1 = (Container)e.getSource();
                container1.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                Container container1 = (Container)e.getSource();
                container1.setBackground(Color.GREEN);
            }

        }

        container.addMouseMotionListener(new MyMouseListener());
        container.addMouseListener(new MyMouseListener());
        setSize(350,250);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new Problem2();
    }
}
