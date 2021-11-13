package chapter10.practice.problem6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem6 extends JFrame
{
    private JLabel jLabel;
    public Problem6()
    {
        this.jLabel = new JLabel("C");
        this.jLabel.setLocation(100,100);
        this.jLabel.setSize(10,10);

        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,350);


        Container container = getContentPane();
        container.setLayout(null);
        jLabel.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e)
            {
                int x = (int)(Math.random()*350);
                int y = (int)(Math.random()*350);
                jLabel.setLocation(x,y);
            }
        });

        container.add(this.jLabel);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        new Problem6();
    }
}
