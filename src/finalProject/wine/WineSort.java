package finalProject.wine;

import java.awt.*;
import java.awt.event.*;
import java.util.TreeMap;
import javax.swing.*;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class RedWineScroll extends JPanel
{
    private JLabel redWine;
    private JList jList;
    private JLabel jLabel = new JLabel();
    private TreeMap<String, String> RedTreeMap = new TreeMap<>();
    private Vector<String> Wines;
    private JScrollPane jScrollPane;
    private WineSortDAO wineSortDAO = new WineSortDAO();

    public void putData()
    {
        this.Wines = new Vector<>();
        for(String Wine : RedTreeMap.keySet())
        {
            this.Wines.add(Wine);
        }
    }

    public RedWineScroll()
    {
        this.redWine = new JLabel("Red Wine / Sort");
        this.redWine.setFont(new Font("Arial",Font.BOLD,15));
        this.redWine.setForeground(Color.WHITE);
        this.redWine.setBackground(new Color(136,24,36));
        this.redWine.setOpaque(true);

        setLayout(new BorderLayout());
        this.wineSortDAO.getDataRed(this.RedTreeMap);
        putData();
        this.jList = new JList(this.Wines);
        jList.setFont(new Font("Areal", Font.PLAIN,17));
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                String Taste = RedTreeMap.get(Wines.get(jList.getSelectedIndex()));
                jLabel.setText("<html><body style =\"font-size : 14px;\">"+Taste+"</body></html>");
                jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,14));
            }

        });

        this.jScrollPane = new JScrollPane(jList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension(157,334));
        add(redWine,BorderLayout.NORTH);
        add(jScrollPane,BorderLayout.WEST);
        add(jLabel,BorderLayout.CENTER);

    }
}


class WhiteWineScroll extends JPanel
{
    private JLabel whiteWine;
    private JList jList;
    private JLabel jLabel = new JLabel();
    private TreeMap<String, String> WhiteTreeMap = new TreeMap<>();
    private Vector<String> Wines = new Vector<>();
    private JScrollPane jScrollPane;
    private WineSortDAO wineSortDAO = new WineSortDAO();

    public void putData()
    {
        this.Wines = new Vector<>();
        for(String Wine : WhiteTreeMap.keySet())
        {
            this.Wines.add(Wine);
        }
    }

    public WhiteWineScroll()
    {
        this.whiteWine = new JLabel("White Wine / Sort");
        this.whiteWine.setOpaque(true);
        this.whiteWine.setFont(new Font("Arial",Font.BOLD,15));
        this.whiteWine.setBackground(new Color(156,189,39));
        this.whiteWine.setForeground(Color.WHITE);

        setLayout(new BorderLayout());
        this.wineSortDAO.getDataWhite(this.WhiteTreeMap);
        putData();
        this.jList = new JList(this.Wines);
        jList.setFont(new Font("Areal", Font.PLAIN,17));
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                String Taste = WhiteTreeMap.get(Wines.get(jList.getSelectedIndex()));
                jLabel.setText("<html><body style =\"font-size : 14px;\">"+Taste+"</body></html>");
                jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,14));
            }

        });

        this.jScrollPane = new JScrollPane(jList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(jScrollPane,BorderLayout.WEST);
        add(jLabel,BorderLayout.CENTER);
        add(whiteWine,BorderLayout.NORTH);
    }
}

class RoseWineScroll extends JPanel
{
    private JLabel roseWine;
    private JList jList;
    private JLabel jLabel = new JLabel();
    private TreeMap<String, String> RoseTreeMap = new TreeMap<>();
    private Vector<String> Wines = new Vector<>();
    private JScrollPane jScrollPane;
    private WineSortDAO wineSortDAO = new WineSortDAO();

    public void putData()
    {
        this.Wines = new Vector<>();
        for(String Wine : RoseTreeMap.keySet())
        {
            this.Wines.add(Wine);
        }
    }

    public RoseWineScroll()
    {
        this.roseWine = new JLabel("Rose Wine / Sort");
        this.roseWine.setOpaque(true);
        this.roseWine.setForeground(Color.WHITE);
        this.roseWine.setBackground(new Color(225,120,110));
        this.roseWine.setFont(new Font("Arial",Font.BOLD,15));

        setLayout(new BorderLayout());
        this.wineSortDAO.getDataRose(this.RoseTreeMap);
        putData();
        this.jList = new JList(this.Wines);
        jList.setFont(new Font("Areal", Font.PLAIN,17));
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                String Taste = RoseTreeMap.get(Wines.get(jList.getSelectedIndex()));
                jLabel.setText("<html><body style =\"font-size : 14px;\">"+Taste+"</body></html>");
                jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,14));
            }

        });

        this.jScrollPane = new JScrollPane(jList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension(157,334));
        add(jScrollPane,BorderLayout.WEST);
        add(jLabel,BorderLayout.CENTER);
        add(roseWine,BorderLayout.NORTH);
    }
}

public class WineSort extends JFrame
{
    private JLabel instructionLabel;
    private JLabel instructionLabelImage;


    private JLabel jLabel = new JLabel();
    private JMenuItem jMenuItem;
    private ImageIcon imageIcon;
    private JLabel imageLabel = new JLabel();
    private JMenu Color;
    private JMenuBar jMenuBar = new JMenuBar();


    private final RedWineScroll redWineScroll = new RedWineScroll();
    private final WhiteWineScroll whiteWineScroll = new WhiteWineScroll();
    private final RoseWineScroll roseWineScroll = new RoseWineScroll();


    private ImageIcon imageSetSize(ImageIcon imageIcon, int x, int y)
    {
        Image xImage = imageIcon.getImage();
        Image yImage = xImage.getScaledInstance(x,y,Image.SCALE_SMOOTH);
        ImageIcon xyImage = new ImageIcon(yImage);
        return (xyImage);
    }

    class MenuActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            instructionLabel.setVisible(false);
            instructionLabelImage.setVisible(false);
            jMenuItem = (JMenuItem)e.getSource();
            switch(jMenuItem.getText())
            {
                case "Red":
                    Color.setForeground(new Color(255,255,255));
                    jMenuBar.setBackground(new Color(136,24,36));
                    redWineScroll.setVisible(true);
                    whiteWineScroll.setVisible(false);
                    roseWineScroll.setVisible(false);
                    jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,15));
                    jLabel.setText(WineSortInformation.RedWine);
                    add(jLabel,BorderLayout.NORTH);
                    imageIcon = new ImageIcon("src//Image//RedWineS.jpg");
                    imageIcon = imageSetSize(imageIcon,230,350);
                    imageLabel.setIcon(imageIcon);
                    add(imageLabel,BorderLayout.WEST);
                    add(redWineScroll,BorderLayout.CENTER);
                    break;


                case "White":
                    Color.setForeground(new Color(255,255,255));
                    jMenuBar.setBackground(new Color(156,189,39));
                    redWineScroll.setVisible(false);
                    whiteWineScroll.setVisible(true);
                    roseWineScroll.setVisible(false);
                    jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,15));
                    jLabel.setText(WineSortInformation.WhiteWine);
                    add(jLabel,BorderLayout.NORTH);
                    imageIcon = new ImageIcon("src//Image//WhiteWineS.jpg");
                    imageIcon = imageSetSize(imageIcon,230,350);
                    imageLabel.setIcon(imageIcon);
                    add(imageLabel,BorderLayout.WEST);
                    add(whiteWineScroll,BorderLayout.CENTER);
                    break;

                case "Rose":
                    Color.setForeground(new Color(255,255,255));
                    jMenuBar.setBackground(new Color(225,120,110));
                    redWineScroll.setVisible(false);
                    whiteWineScroll.setVisible(false);
                    roseWineScroll.setVisible(true);
                    jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,15));
                    jLabel.setText(WineSortInformation.RoseWine);
                    add(jLabel,BorderLayout.NORTH);
                    imageIcon = new ImageIcon("src//Image//RoseWineS.jpg");
                    imageIcon = imageSetSize(imageIcon,230,350);
                    imageLabel.setIcon(imageIcon);
                    add(imageLabel,BorderLayout.WEST);
                    add(roseWineScroll,BorderLayout.CENTER);
                    break;

                default:
                    System.out.println("Error\n");
                    break;
            }
        }
    }


    public void CreateMenu()
    {
        this.jMenuBar.setBackground(new Color(170,170,170));
        MenuActionListener menuActionListener = new MenuActionListener();
        this.Color = new JMenu("Wines");
        Color.setFont(new Font("Arial",Font.BOLD,14));

        JMenuItem Red = new JMenuItem("Red");
        Red.setForeground(java.awt.Color.WHITE);
        Red.setBackground(new Color(136,24,36));

        JMenuItem White = new JMenuItem("White");
        White.setBackground(new Color(156,189,39));
        White.setForeground(java.awt.Color.WHITE);

        JMenuItem Rose = new JMenuItem("Rose");
        Rose.setBackground(new Color(225,120,110));
        Rose.setForeground(java.awt.Color.WHITE);

        Red.setFont(new Font("Arial",Font.PLAIN,14));
        White.setFont(new Font("Arial",Font.PLAIN,14));
        Rose.setFont(new Font("Arial",Font.PLAIN,14));

        Red.addActionListener(menuActionListener);
        White.addActionListener(menuActionListener);
        Rose.addActionListener(menuActionListener);


        Color.add(Red);
        Color.addSeparator();
        Color.add(White);
        Color.addSeparator();
        Color.add(Rose);

        this.jMenuBar.add(Color);
        setJMenuBar(jMenuBar);

    }

    public WineSort()
    {
        setVisible(true);
        this.instructionLabel = new JLabel(WineSortInformation.Instruction);
        this.instructionLabel.setBackground(new Color(136,24,36));
        this.instructionLabel.setOpaque(true);
        this.instructionLabel.setPreferredSize(new Dimension(500,560));
        this.instructionLabel.setForeground(new Color(255,255,255));
        this.instructionLabel.setFont(new Font("맑은 고딕",Font.PLAIN,14));


        ImageIcon imageIcon = new ImageIcon("src//Image//DecoImage.jpg");
        imageIcon = imageSetSize(imageIcon,220,560);
        this.instructionLabelImage = new JLabel();
        this.instructionLabelImage.setIcon(imageIcon);

        setTitle("와인 종류");
        setResizable(false);
        CreateMenu();

        setSize(720,540);
        setLayout(new BorderLayout());

        add(this.instructionLabel,BorderLayout.WEST);
        add(this.instructionLabelImage,BorderLayout.CENTER);
    }





    public static void main(String [] args)
    {
        new WineSort();
    }
}
