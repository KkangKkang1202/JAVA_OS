package chapter10.example.example6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame
{
    private JLabel [] keyMessage;

    public KeyListenerEx()
    {
        setTitle("keyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        this.keyMessage = new JLabel[3];
        this.keyMessage[0] = new JLabel("getKeyCode()");
        this.keyMessage[1] = new JLabel("getKeyChar()");
        this.keyMessage[2] = new JLabel("getKeyText()");

        for(int i=0; i<keyMessage.length; i++)
        {
            container.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.YELLOW);
        }
        class MyKeyListener extends KeyAdapter
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                int keyCode = e.getKeyCode();
                char keyChar = e.getKeyChar();

                keyMessage[0].setText(Integer.toString(keyCode));
                keyMessage[1].setText(Character.toString(keyChar));
                keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
            }
        }

        container.addKeyListener(new MyKeyListener());

        setSize(300,150);
        setVisible(true);

        container.setFocusable(true);
        container.requestFocus();

    }

    public static void main(String [] args)
    {
        new KeyListenerEx();
    }
}
