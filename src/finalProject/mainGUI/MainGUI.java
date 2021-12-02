package finalProject.mainGUI;


import finalProject.notePad.NotePad;
import finalProject.search.Map;
import finalProject.terms.WineTerm;
import finalProject.wine.WineSort;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

class ex1 extends JFrame
{
    private WineSort wineSort;
    private WineTerm wineTerm;
    private Map map;
    private NotePad notePad;


    ImageIcon i = new ImageIcon("C://Temp//Projects//background1.png");
    Image im=i.getImage();

    public ex1()
    {
        this.setTitle("Enjoying Wine!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        MyPanel panel = new MyPanel();
        panel.setLayout(null);


        this.add(panel);
        this.setSize(720,540);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton button_Exit = new JButton("종료(Exit)");
        button_Exit.setBounds(500,450,180,40);
        button_Exit.setFont(new Font("맑은 고딕",Font.BOLD,20));
        button_Exit.setBackground(new Color(235,235,235));
        button_Exit.setForeground(new Color(136,24,36));
        button_Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Result=JOptionPane.showConfirmDialog(null, "종료하시겠습니까?","Exit",JOptionPane.YES_NO_OPTION);
                if(Result == JOptionPane.CLOSED_OPTION) {}
                else if(Result==JOptionPane.YES_OPTION) {
                    System.exit(1);
                }
            }
        });


        JButton button_Search = new JButton("검색하기(추가기능)");
        button_Search.setBounds(450,130,200,50);
        button_Search.setFont(new Font("맑은 고딕",Font.BOLD,20));
        button_Search.setForeground(new Color(136,24,36));
        button_Search.setBackground(new Color(235,235,235));
        button_Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               map = new Map();
            }
        });

        JButton button_Site = new JButton("와인 구매 사이트");
        button_Site.setBounds(30,450,150,30);
        button_Site.setFont(new Font("맑은 고딕",Font.ITALIC,15));
        button_Site.setForeground(new Color(136,24,36));
        button_Site.setBackground(new Color(235,235,235));
        button_Site.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.winenara.com/"));
                }
                catch(IOException | URISyntaxException exception)
                {
                    exception.printStackTrace();
                }
            }
        });

        JButton button_Word = new JButton("용어 알아보기");
        button_Word.setBounds(450,330,200,50);
        button_Word.setFont(new Font("맑은 고딕",Font.BOLD,20));
        button_Word.setForeground(new Color(136,24,36));
        button_Word.setBackground(new Color(235,235,235));
        button_Word.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                wineTerm = new WineTerm();
            }
        });

        JButton button_List = new JButton("와인 리스트 보기");
        button_List.setBounds(450,230,200,50);
        button_List.setFont(new Font("맑은 고딕",Font.BOLD,20));
        button_List.setForeground(new Color(136,24,36));
        button_List.setBackground(new Color(235,235,235));
        button_List.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                wineSort = new WineSort();
            }
        });

        JButton button_NotePad = new JButton("정리하기(메모장)");
        button_NotePad.setBounds(450,30,200,50);
        button_NotePad.setFont(new Font("맑은 고딕",Font.BOLD,20));
        button_NotePad.setForeground(new Color(136,24,36));
        button_NotePad.setBackground(new Color(235,235,235));
        button_NotePad.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                notePad = new NotePad();
            }
        });

        panel.add(button_NotePad);
        panel.add(button_Search);
        panel.add(button_Exit);
        panel.add(button_Site);
        panel.add(button_List);
        panel.add(button_Word);
        this.setVisible(true);
    }



    class MyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
}

public class MainGUI
{
    public static void main(String[] args)
    {
        new ex1();
    }
}
