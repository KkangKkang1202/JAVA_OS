package chapter10.practice.problem4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem4 extends JFrame
{
    private JLabel jLabel;

    public Problem4()
    {
        setTitle("Left 키로 문자열 이동하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        this.jLabel = new JLabel("Love Java");
        container.add(this.jLabel);
        container.setFocusable(true);
        container.requestFocus();

        class MyKeyListener extends KeyAdapter
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    String Text = jLabel.getText();
                    jLabel.setText(Text.substring(1)+Text.charAt(0));
                }
            }
        }

        container.addKeyListener(new MyKeyListener());

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new Problem4();
    }
}
