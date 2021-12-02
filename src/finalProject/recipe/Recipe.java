package finalProject.recipe;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.awt.Desktop;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Vector;
import javax.imageio.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Recipe extends JFrame
{
    private JButton jButtonRed = new JButton();
    private JButton jButtonWhite = new JButton();
    private JButton jButtonRose = new JButton();
    private JLabel DecorationLabel = new JLabel();
    private JLabel DecorationLabel2 = new JLabel();
    private ImageIcon imageIcon;
    private JLabel imageLabel = new JLabel();
    private JLabel InstructionLabel = new JLabel();


    private RecipeDAO recipeDAO = new RecipeDAO();


    private JScrollPane jScrollPane = new JScrollPane();


    private JList jListRed;
    private JList jListWhite;
    private JList jListRose;


    private JScrollPane jScrollPaneRed = new JScrollPane();
    private JScrollPane jScrollPaneWhite = new JScrollPane();
    private JScrollPane jScrollPaneRose = new JScrollPane();


    private Vector<String> vectorRed = new Vector<>();
    private Vector<String> vectorWhite = new Vector<>();
    private Vector<String> vectorRose = new Vector<>();


    private JButton jButtonSearchingNaver = new JButton();
    private JButton jButtonSearchingGoogle = new JButton();


    private String search;


    private int ClickSignalRed;
    private int ClickSignalWhite;
    private int ClickSignalRose;


    private void putData()
    {
        recipeDAO.getDataRed(this.vectorRed);
        recipeDAO.getDataWhite(this.vectorWhite);
        recipeDAO.getDataRose(this.vectorRose);
    }


    private ImageIcon imageSetSize(ImageIcon imageIcon, int x, int y)
    {
        Image xImage = imageIcon.getImage();
        Image yImage = xImage.getScaledInstance(x,y,Image.SCALE_SMOOTH);
        return (new ImageIcon(yImage));
    }


    private void putString(String string)
    {
        this.search = null;
        this.search = string;
    }


    private String getSearch()
    {
        if(this.search == null)
        {
            return (null);
        }
        return (this.search);
    }


    public Recipe()
    {
        this.ClickSignalRed = 0;
        this.ClickSignalRose = 0;
        this.ClickSignalWhite = 0;


        this.putData();
        setTitle("레시피");
        setResizable(false);
        setSize(new Dimension(720,540));
        setLayout(null);
        this.setBackground(new Color(255,255,240));
        this.DecorationLabel.setOpaque(true);
        this.DecorationLabel.setBackground(Color.LIGHT_GRAY);
        this.DecorationLabel.setBounds(0,0,720,30);


        this.DecorationLabel2.setOpaque(true);
        this.DecorationLabel2.setBackground(Color.LIGHT_GRAY);
        this.DecorationLabel2.setBounds(0,240,720,30);


        this.InstructionLabel.setOpaque(true);
        this.InstructionLabel.setFont(new Font("맑은 고딕",Font.BOLD,16));
        this.InstructionLabel.setText("<html>각각의 와인버튼을 클릭해서, 클릭한 와인과 어울리는 음식의 레시피를<br>살펴보고, 검색해보세요!</html>");
        this.InstructionLabel.setBounds(170,50, 520, 160);
        this.InstructionLabel.setBackground(new Color(236,230,204));


        imageIcon = new ImageIcon("C:\\Temp\\RedWhiteRose.jpg");
        imageIcon = imageSetSize(imageIcon,720,250);
        imageLabel.setIcon(imageIcon);
        imageLabel.setBounds(0,270,720,250);


        this.jListRed = new JList(this.vectorRed);
        this.jListRed.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        this.jListRed.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                putString(vectorRed.get(jListRed.getSelectedIndex()));
            }
        });


        this.jListWhite = new JList(this.vectorWhite);
        this.jListWhite.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        this.jListWhite.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                putString(vectorWhite.get(jListWhite.getSelectedIndex()));
            }
        });


        this.jListRose = new JList(this.vectorRose);
        this.jListRose.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        this.jListRose.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                putString(vectorRose.get(jListRose.getSelectedIndex()));
            }
        });


        this.jScrollPane.setBounds(170,50,480,160);


        this.jButtonRed.setBackground(new Color(136,24,36));
        this.jButtonRed.setText("RedWine");
        this.jButtonRed.setFont(new Font("맑은 고딕", Font.BOLD,14));
        this.jButtonRed.setForeground(new Color(235,235,235));
        this.jButtonRed.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ClickSignalRed == 1)
                {
                    return;
                }
                ClickSignalRed+=1;
                ClickSignalRose = 0;
                ClickSignalWhite = 0;
                InstructionLabel.setVisible(false);
                DecorationLabel.setBackground(new Color(136,24,36));
                DecorationLabel.setText("Red Wine");
                DecorationLabel.setForeground(new Color(235,235,235));
                DecorationLabel.setFont(new Font("맑은 고딕",Font.BOLD,19));
                DecorationLabel2.setBackground(new Color(136,24,36));
                DecorationLabel2.setText("==================================================");
                DecorationLabel2.setFont(new Font("맑은 고딕",Font.BOLD,19));
                DecorationLabel2.setForeground(new Color(235,235,235));

                imageIcon = new ImageIcon("C:\\Temp\\RedWine.jpg");
                imageIcon = imageSetSize(imageIcon,720,250);
                imageLabel.setIcon(imageIcon);
                imageLabel.setBounds(0,270,720,250);

                jScrollPaneRed = new JScrollPane(jListRed,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                add(jScrollPaneRed);
                jScrollPaneRed.setBounds(170,50,400,160);
                jScrollPaneRed.setVisible(true);
                jScrollPaneWhite.setVisible(false);
                jScrollPaneRose.setVisible(false);

                jListRed.setVisible(true);
                jListWhite.setVisible(false);
                jListRose.setVisible(false);

                jButtonSearchingGoogle.setVisible(true);
                jButtonSearchingNaver.setVisible(true);

                jButtonSearchingNaver.setBackground(new Color(136,24,36));
                jButtonSearchingGoogle.setBackground(new Color(136,24,36));
            }
        });


        this.jButtonWhite.setBackground(new Color(156,189,39));
        this.jButtonWhite.setText("WhiteWine");
        this.jButtonWhite.setFont(new Font("맑은 고딕",Font.BOLD,14));
        this.jButtonWhite.setForeground(new Color(235,235,235));
        this.jButtonWhite.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ClickSignalWhite == 1)
                {
                    return;
                }
                ClickSignalWhite+=1;
                ClickSignalRose = 0;
                ClickSignalRed = 0;
                InstructionLabel.setVisible(false);
                DecorationLabel.setBackground(new Color(156,189,39));
                DecorationLabel2.setBackground(new Color(156,189,39));
                DecorationLabel.setText("White Wine");
                DecorationLabel.setForeground(new Color(235,235,235));
                DecorationLabel.setFont(new Font("맑은 고딕",Font.BOLD,19));
                DecorationLabel2.setText("==================================================");
                DecorationLabel2.setFont(new Font("맑은 고딕",Font.BOLD,19));
                DecorationLabel2.setForeground(new Color(235,235,235));

                imageIcon = new ImageIcon("C:\\Temp\\WhiteWine.jpg");
                imageIcon = imageSetSize(imageIcon,720,250);
                imageLabel.setIcon(imageIcon);
                imageLabel.setBounds(0,270,720,250);

                jScrollPaneWhite = new JScrollPane(jListWhite,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                add(jScrollPaneWhite);
                jScrollPaneWhite.setBounds(170,50,400,160);
                jScrollPaneWhite.setVisible(true);
                jScrollPaneRed.setVisible(false);
                jScrollPaneRose.setVisible(false);

                jListRed.setVisible(false);
                jListWhite.setVisible(true);
                jListRose.setVisible(false);

                jButtonSearchingGoogle.setVisible(true);
                jButtonSearchingNaver.setVisible(true);

                jButtonSearchingNaver.setBackground(new Color(156,189,39));
                jButtonSearchingGoogle.setBackground(new Color(156,189,39));
            }
        });


        this.jButtonRose.setBackground(new Color(225,120,110));
        this.jButtonRose.setText("RoseWine");
        this.jButtonRose.setFont(new Font("맑은 고딕",Font.BOLD,14));
        this.jButtonRose.setForeground(new Color(235,235,235));
        this.jButtonRose.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ClickSignalRose == 1)
                {
                    return;
                }
                ClickSignalRose+=1;
                ClickSignalRed = 0;
                ClickSignalWhite = 0;
                InstructionLabel.setVisible(false);
                DecorationLabel.setBackground(new Color(225,120,110));
                DecorationLabel2.setBackground(new Color(225,120,110));
                DecorationLabel.setText("Rose Wine");
                DecorationLabel.setForeground(new Color(235,235,235));
                DecorationLabel.setFont(new Font("맑은 고딕",Font.BOLD,19));
                DecorationLabel2.setText("==================================================");
                DecorationLabel2.setFont(new Font("맑은 고딕",Font.BOLD,19));
                DecorationLabel2.setForeground(new Color(235,235,235));

                imageIcon = new ImageIcon("C:\\Temp\\RoseWine.jpg");
                imageIcon = imageSetSize(imageIcon,720,250);
                imageLabel.setIcon(imageIcon);
                imageLabel.setBounds(0,270,720,250);

                jScrollPaneRose = new JScrollPane(jListRose,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                add(jScrollPaneRose);
                jScrollPaneRose.setBounds(170,50,400,160);

                jScrollPaneRose.setVisible(true);
                jScrollPaneRed.setVisible(false);
                jScrollPaneWhite.setVisible(false);

                jListRed.setVisible(false);
                jListWhite.setVisible(false);
                jListRose.setVisible(true);

                jButtonSearchingGoogle.setVisible(true);
                jButtonSearchingNaver.setVisible(true);

                jButtonSearchingNaver.setBackground(new Color(225,120,110));
                jButtonSearchingGoogle.setBackground(new Color(225,120,110));
            }
        });

        this.jButtonRed.setBounds(10,50,140,40);
        this.jButtonWhite.setBounds(10,110,140,40);
        this.jButtonRose.setBounds(10,170,140,40);


        this.jButtonSearchingNaver = new JButton("검색하기(네이버)");
        this.jButtonSearchingGoogle = new JButton("검색하기(구글)");


        this.jButtonSearchingNaver.setBounds(580,70,120,40);
        this.jButtonSearchingGoogle.setBounds(580,130,120,40);


        this.jButtonSearchingNaver.setForeground(new Color(235,235,235));
        this.jButtonSearchingGoogle.setForeground(new Color(235,235,235));


        this.jButtonSearchingNaver.setFont(new Font("맑은 고딕", Font.BOLD,11));
        this.jButtonSearchingGoogle.setFont(new Font("맑은 고딕",Font.BOLD,11));


        this.jButtonSearchingNaver.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Text = getSearch();
                try
                {
                    if (Text == null)
                    {
                        JOptionPane.showMessageDialog(null,"요리를 선택하세요.","정보",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        Desktop.getDesktop().browse(new URI("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=" + Text + "+레시피"));

                    }
                }
                catch (IOException | URISyntaxException exception)
                {
                    JOptionPane.showMessageDialog(null,"알 수 없는 오류","에러",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        this.jButtonSearchingGoogle.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Text = getSearch();
                try
                {
                    if (Text == null)
                    {
                        JOptionPane.showMessageDialog(null,"요리를 선택하세요.","정보",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=" + Text + "+레시피"));

                    }
                }
                catch (IOException | URISyntaxException exception)
                {
                    JOptionPane.showMessageDialog(null,"알 수 없는 오류","에러",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        this.add(this.DecorationLabel);
        this.add(this.DecorationLabel2);
        this.add(this.jButtonRed);
        this.add(this.jButtonWhite);
        this.add(this.jButtonRose);
        this.add(this.imageLabel);
        this.add(this.InstructionLabel);
        this.add(this.jButtonSearchingNaver);
        this.add(this.jButtonSearchingGoogle);

        this.jButtonSearchingGoogle.setVisible(false);
        this.jButtonSearchingNaver.setVisible(false);

        setVisible(true);

    }

    public static void main(String[] args)
    {
        new Recipe();
    }
}
