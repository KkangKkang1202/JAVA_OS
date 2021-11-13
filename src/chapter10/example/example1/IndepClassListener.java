package chapter10.example.example1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyActionListener implements ActionListener
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
    }
}

public class IndepClassListener extends JFrame
{
    public IndepClassListener()
    {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JButton button = new JButton("Action");
        button.addActionListener(new MyActionListener());
        container.add(button);

        setSize(350,150);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        new IndepClassListener();
    }
}
