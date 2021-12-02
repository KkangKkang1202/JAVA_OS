package finalProject.search;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.awt.Desktop;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;


class North extends JPanel
{
    public North()
    {
        setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("<html><body style=\"font-size:11px\">찾고 싶은 와인/레시피를 입력하세요.</body></html>");
        jLabel.setFont(new Font("맑은 고딕",Font.BOLD,11));
        JTextField textField = new JTextField("",30);
        JButton searchingButton = new JButton("<html><body style=\"font-size:12px\">검색</body></html>");
        setBackground(new Color(255,192,203));
        searchingButton.setFont(new Font("맑은 고딕",Font.BOLD,12));
        searchingButton.setForeground(Color.WHITE);
        searchingButton.setBackground(new Color(136,24,36));
        searchingButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Text = textField.getText();
                try
                {
                    Desktop.getDesktop().browse(new URI("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query="+Text));
                }
                catch (IOException | URISyntaxException exception)
                {
                    JOptionPane.showMessageDialog(null,"공백을 포함하지 마세요.","정보",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        textField.setPreferredSize(new Dimension(300,30));
        searchingButton.setPreferredSize(new Dimension(90,30));
        add(jLabel);
        add(textField);
        add(searchingButton);
    }
}

class South extends JPanel
{
    public South()
    {
        setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("<html><body style=\"font-size:11px\">판매점 혹은 식당을 입력하세요.</body></html>");
        jLabel.setFont(new Font("맑은 고딕",Font.BOLD,11));
        JTextField textField = new JTextField("",30);
        JButton searchingButton = new JButton("<html><body style=\"font-size:12px\">검색</body></html>");
        setBackground(new Color(255,192,203));
        searchingButton.setFont(new Font("맑은 고딕",Font.BOLD,12));
        searchingButton.setForeground(Color.WHITE);
        searchingButton.setBackground(new Color(136,24,36));
        searchingButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Text = textField.getText();
                try
                {
                    Desktop.getDesktop().browse(new URI("https://map.naver.com/v5/search/"+Text));
                }
                catch (IOException | URISyntaxException exception)
                {
                    JOptionPane.showMessageDialog(null,"공백을 포함하지 마세요.","정보",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        textField.setPreferredSize(new Dimension(300,30));
        searchingButton.setPreferredSize(new Dimension(90,30));


        add(jLabel);
        add(textField);
        add(searchingButton);
    }
}

public class Map extends JFrame
{
    public Map()
    {
        setTitle("검색하기");
        setSize(720,540);
        setLayout(new BorderLayout());
        add(new North(),BorderLayout.NORTH);
        add(new South(),BorderLayout.SOUTH);
        Image image = null;
        try
        {
            File SourceImage = new File("C:\\Temp\\Projects\\SearchWine.jpg");
            image = ImageIO.read(SourceImage);
            image.getScaledInstance(300,300,Image.SCALE_SMOOTH);
            JLabel imgLabel = new JLabel(new ImageIcon(image));
            add(imgLabel,BorderLayout.CENTER);
        }
        catch (IOException | NullPointerException e)
        {
            e.printStackTrace();
        }


        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Map();
    }
}
