package chapter10.example.example3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame
{
    public AnonymousClassListener()
    {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JButton button = new JButton("Action");
        container.add(button);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JButton button1 = (JButton)e.getSource();
                if(button1.getText().equals("Action"))
                {
                    button1.setText("액션");
                }
                else
                {
                    button1.setText("Action");
                }
                setTitle(button1.getText());
            }
        });

        setSize(350,150);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new AnonymousClassListener();
    }
}
