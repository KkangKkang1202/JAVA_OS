package chapter10.example.example9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame
{
    private JLabel label = new JLabel("No Mouse Event");

    public MouseListenerAllEx()
    {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        class MyMouseListener implements  MouseListener, MouseMotionListener
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                label.setText("MousePressed ("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                label.setText("MouseReleased ("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e)
            {
                Component component = (Component)e.getSource();
                component.setBackground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                Component component = (Component)e.getSource();
                component.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseDragged(MouseEvent e)
            {
                label.setText("MouseDragged("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mouseMoved(MouseEvent e)
            {
                label.setText("MouseMoved("+e.getX()+","+e.getY()+")");
            }
        }

        MyMouseListener listener = new MyMouseListener();
        container.addMouseListener(listener);
        container.addMouseMotionListener(listener);
        container.add(label);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new MouseListenerAllEx();
    }
}
