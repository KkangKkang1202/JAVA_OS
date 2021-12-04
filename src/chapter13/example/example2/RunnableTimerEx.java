package chapter13.example.example2;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable
{
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel)
    {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run()
    {
        int n=0;
        while(true)
        {
            timerLabel.setText(Integer.toString(n));
            n++;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                return;
            }
        }
    }
}

public class RunnableTimerEx extends JFrame
{
    public RunnableTimerEx()
    {
        setTitle("Runnable을 구현한 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        container.add(timerLabel);

        TimerRunnable runnable = new TimerRunnable(timerLabel);
        Thread thread = new Thread(runnable);

        setSize(250,150);
        setVisible(true);

        thread.start();
    }

    public static void main(String[] args)
    {
        new RunnableTimerEx();
    }
}
