package chapter10.example.example8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame
{
    private final int FLYING_UNIT = 10;
    private JLabel label = new JLabel("HELLO");

    public FlyingTextEx()
    {
        setTitle("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        class MyKeyListener extends KeyAdapter
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                int  keyCode = e.getKeyCode();

                switch(keyCode)
                {
                    case KeyEvent.VK_UP:
                        label.setLocation(label.getX(), label.getY()-FLYING_UNIT);
                        break;

                    case KeyEvent.VK_DOWN:
                        label.setLocation(label.getX(), label.getY()+FLYING_UNIT);
                        break;

                    case KeyEvent.VK_LEFT:
                        label.setLocation(label.getX()-FLYING_UNIT, label.getY());
                        break;

                    case KeyEvent.VK_RIGHT:
                        label.setLocation(label.getX()+FLYING_UNIT, label.getY());
                        break;
                }
            }
        }

        container.addKeyListener(new MyKeyListener());

        label.setLocation(50,50);
        label.setSize(100,20);
        container.add(label);
        setSize(300,300);
        setVisible(true);
        container.setFocusable(true);
        container.requestFocus();

        container.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                Component component = (Component)e.getSource();
                component.setFocusable(true);
                component.requestFocus();
            }
        });
    }

    public static void main(String [] args)
    {
        new FlyingTextEx();
    }
}
