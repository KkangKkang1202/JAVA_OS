package chapter10.example.example2;

import chapter10.example.example1.IndepClassListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame
{
    InnerClassListener()
    {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JButton jButton = new JButton("Action");
        jButton.addActionListener(new MyActionListener());

        container.add(jButton);

        setSize(350,150);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton button = (JButton)e.getSource();
            if(button.getText().equals("Action"))
            {
                button.setText("액션");
            }
            else
            {
                button.setText("Action");
            }
            InnerClassListener.this.setTitle(button.getText());
        }
    }

    public static void main(String [] args)
    {
        new InnerClassListener();
    }
}
