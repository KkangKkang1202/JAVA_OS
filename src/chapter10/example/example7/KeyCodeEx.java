package chapter10.example.example7;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame
{
    private JLabel label = new JLabel();

    public KeyCodeEx()
    {
        setTitle("Key Code 예제 : F1키 : 초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();

        class MyKeyListener extends KeyAdapter
        {
            public void keyPressed(KeyEvent e)
            {
                label.setText(e.getKeyText(e.getKeyCode()));
                if(e.getKeyChar() == '%')
                {
                    getContentPane().setBackground(Color.YELLOW);
                }
                else if(e.getKeyCode() == KeyEvent.VK_F1)
                {
                    getContentPane().setBackground(Color.GREEN);
                }
            }
        }

        container.addKeyListener(new MyKeyListener());
        container.add(label);

        setSize(300,150);
        setVisible(true);

        container.setFocusable(true);
        container.requestFocus();
    }

    public static void main(String [] args)
    {
        new KeyCodeEx();
    }
}
