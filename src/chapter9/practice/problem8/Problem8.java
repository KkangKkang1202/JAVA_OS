package chapter9.practice.problem8;

import java.awt.*;
import javax.swing.*;

class North extends JPanel
{
    public North()
    {
        setBackground(Color.GRAY);
        setLayout(new FlowLayout());
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class Center extends JPanel
{
    public Center()
    {
        setLayout(null);
        for(int count=0; count < 10; count++)
        {
            int x = (int)(Math.random()*200)+10;
            int y = (int)(Math.random()*200)+10;

            JLabel jLabel = new JLabel("*");
            jLabel.setForeground(Color.RED);
            jLabel.setSize(20,20);
            jLabel.setOpaque(true);
            jLabel.setLocation(x,y);
            add(jLabel);
        }
    }
}

class South extends JPanel
{
    public South()
    {
        setBackground(Color.YELLOW);
        setLayout(new FlowLayout());
        add(new JButton("Word Input"));
        add(new JTextField(20));
    }
}

public class Problem8 extends JFrame
{
    public Problem8()
    {
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(350,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        North north = new North();
        Center center = new Center();
        South south = new South();

        container.add(north, BorderLayout.NORTH);
        container.add(center, BorderLayout.CENTER);
        container.add(south, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String [] args)
    {
        new Problem8();
    }
}
