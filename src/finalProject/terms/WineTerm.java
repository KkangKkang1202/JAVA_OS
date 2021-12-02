package finalProject.terms;


import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Vector;



public class WineTerm extends JFrame
{
    private JList jList;
    private TreeMap<String, String> dictionary = new TreeMap<>();
    private WineTermDAO wineTermDAO = new WineTermDAO();
    private Vector<String> Terms = new Vector<>();
    private JScrollPane jScrollPane;
    private JLabel jLabel = new JLabel();
    private JLabel decorating = new JLabel("<html><body style=\"font-size : 14px\">Wine Dictionary" +
            "----------------------------------------------------------------------------------------------</body></html>");


    public void putData()
    {
        this.Terms = new Vector<>();
        for(String term : dictionary.keySet())
        {
            this.Terms.add(term);
        }
    }


    public WineTerm()
    {

        this.decorating.setBackground(new Color(136,24,36));
        this.decorating.setPreferredSize(new Dimension(720,30));
        this.decorating.setForeground(Color.white);

        this.wineTermDAO.getData(this.dictionary);
        this.putData();


        setTitle("와인과 관련된 용어들");
        setSize(720,540);
        setLayout(new BorderLayout());

        this.jList = new JList(this.Terms);
        jList.setFont(new Font("Areal", Font.PLAIN,17));
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                String mean = dictionary.get(Terms.get(jList.getSelectedIndex()));
                jLabel.setText("<html><body style =\"font-size : 14px;\">"+mean+"</body></html>");
                jLabel.setFont(new Font("맑은 고딕",Font.PLAIN,14));
            }
        });


        Image image = null;


        try
        {
            JLabel imageLabel = new JLabel();
            imageLabel.setPreferredSize(new Dimension(100,200));
            File SourceImage = new File("C:\\Temp\\Projects\\TermWine.jpg");
            image = ImageIO.read(SourceImage);
            Image image1 = image.getScaledInstance(720,200,Image.SCALE_SMOOTH);

            imageLabel.setIcon(new ImageIcon(image1));
            add(imageLabel,BorderLayout.SOUTH);
        }
        catch (IOException | NullPointerException e)
        {
            e.printStackTrace();
        }


        this.jScrollPane = new JScrollPane(jList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.jScrollPane.setPreferredSize(new Dimension(250,340));


        this.decorating.setOpaque(true);

        add(this.decorating,BorderLayout.NORTH);
        add(this.jScrollPane,BorderLayout.WEST);
        add(this.jLabel,BorderLayout.CENTER);

        setVisible(true);
        setResizable(false);
    }

    public static void main(String [] args)
    {
        new WineTerm();
    }
}
