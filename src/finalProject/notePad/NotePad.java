package finalProject.notePad;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;


public class NotePad extends JFrame
{
    public NotePad()
    {
        JFrame frame = new JFrame("메모장");
        setUIFont(new FontUIResource(new Font("맑은 고딕",Font.PLAIN,11)));
        JPanel textPanel = new JPanel();
        JPanel alarmPanel = new JPanel();
        frame.setSize(new Dimension(720,540));

        alarmPanel.setToolTipText("기타 사용을 위해 이용하는 부분입니다.");
        textPanel.setBackground(new Color(136,24,36));
        alarmPanel.setBackground(new Color(255,255,255));
        frame.getContentPane().add(textPanel, "North");
        frame.getContentPane().add(alarmPanel, "South");
        JTextArea ta = new JTextArea(content, 40, 50);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setToolTipText("이곳에 텍스트를 입력하세요");
        Border lineBorder = BorderFactory.createLineBorder(Color.black, 3);
        Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
        ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
        textPanel.add(new JScrollPane(ta));




        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenu findMenu = new JMenu("찾기/바꾸기");
        JMenuItem newItem = new JMenuItem("새 문서");
        JMenuItem openItem = new JMenuItem("열기");
        JMenuItem saveItem = new JMenuItem("저장");
        JMenuItem saveasItem = new JMenuItem("다른 이름으로 저장");
        JMenuItem closeItem = new JMenuItem("닫기");
        JMenuItem findItem = new JMenuItem("찾기");
        JMenuItem replaceItem = new JMenuItem("바꾸기");

        fileMenu.setFont(new Font("맑은 고딕",Font.BOLD,13));
        findMenu.setFont(new Font("맑은 고딕",Font.BOLD,13));

        frame.setJMenuBar(menuBar);

        menuBar.add(fileMenu);
        menuBar.add(findMenu);
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveasItem);
        fileMenu.add(closeItem);

        findMenu.add(findItem);
        findMenu.add(replaceItem);


        JTextField searchtext = new JTextField(10);
        alarmPanel.add(searchtext);
        JButton btn1 = new JButton("찾기");
        alarmPanel.add(btn1);

        JTextField replacetext = new JTextField(10);


        alarmPanel.add(replacetext);


        JButton btn2 = new JButton("바꾸기");
        alarmPanel.add(btn2);


        JTextArea tf = new JTextArea("", 10,40);
        alarmPanel.add(tf);
        tf.setEditable(false);
        tf.setLineWrap(true);

        JScrollPane alarmscroll = (JScrollPane) alarmPanel.add(new JScrollPane(tf));


        tf.setToolTipText("찾기 기능을 이용한 목록을 확인 할 수 있습니다.");
        searchtext.setToolTipText("찾기 기능을 이용할 수 있습니다.");
        replacetext.setToolTipText("바꾸기 기능을 이용할 수 있습니다.");
        tf.setVisible(false);
        searchtext.setVisible(false);
        replacetext.setVisible(false);
        btn1.setVisible(false);
        btn2.setVisible(false);
        alarmscroll.setVisible(false);
        tf.setVisible(false);

        FileDialog mSave = new FileDialog(frame,"저장",FileDialog.SAVE);
        FileDialog mOpen = new FileDialog(frame,"열기",FileDialog.LOAD);


        newItem.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                ta.setText(content);
                frame.setTitle("메모장");
                flag = 0;
                frame.setSize(600,810);
            }
        });

        openItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                mOpen.setVisible(true);
                String data = mOpen.getDirectory()+ mOpen.getFile();
                try
                {
                    String str="";
                    FileReader fr = new FileReader(data);
                    BufferedReader br = new BufferedReader(fr);


                    ta.setText("");  // 일단 초기화
                    while((str=br.readLine()) != null)
                    {
                        ta.append(str);
                        ta.append("\r\n");
                    }

                    br.close();
                    String Filename = mOpen.getFile();
                    frame.setTitle(Filename);
                    flag = 1;
                }
                catch(Exception ignored)
                {

                }
            }


        });

        saveItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                if(flag == 0)
                {
                    mSave.setVisible(true);
                    String data = mSave.getDirectory()+ mSave.getFile();
                    try
                    {
                        FileWriter fw = new FileWriter(data+".txt");
                        BufferedWriter bw = new BufferedWriter(fw);

                        String str = ta.getText();
                        for(int i = 0 ; i < str.length(); i++)
                        {
                            if(str.charAt(i) == '\n')
                            {
                                System.out.println("find");
                                bw.newLine();
                            }
                            else
                                bw.write(str.charAt(i));
                        }

                        bw.close();
                        String Filename = mSave.getFile();
                        frame.setTitle(Filename + ".txt");
                    }
                    catch(Exception ignored)
                    {

                    }
                    flag = 1;
                }

                else if(flag == 1)
                {
                    String data = mSave.getDirectory()+ mSave.getFile();

                    try{
                        FileWriter fw = new FileWriter(data+".txt");
                        BufferedWriter bw = new BufferedWriter(fw);

                        String str = ta.getText();
                        for(int i = 0 ; i < str.length(); i++)
                        {
                            if(str.charAt(i) == '\n')
                            {
                                System.out.println("find");
                                bw.newLine();
                            }
                            else
                                bw.write(str.charAt(i));
                        }
                        bw.close();
                    }
                    catch(Exception ignored)
                    {

                    }

                }

            }
        });

        saveasItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                mSave.setVisible(true);
                String data = mSave.getDirectory()+ mSave.getFile();
                try
                {
                    FileWriter fw = new FileWriter(data+".txt");
                    BufferedWriter bw = new BufferedWriter(fw);

                    String str = ta.getText();
                    for(int i = 0 ; i < str.length(); i++)
                    {
                        if(str.charAt(i) == '\n')
                        {
                            System.out.println("find");
                            bw.newLine();

                        }
                        else
                            bw.write(str.charAt(i));
                    }

                    bw.close();
                    String Filename = mSave.getFile();
                    frame.setTitle(Filename + ".txt");
                }
                catch(Exception ignored)
                {

                }


            }
        });

        closeItem.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });


        findItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                frame.setSize(800,860);
                searchtext.setVisible(true);
                btn1.setVisible(true);

                replacetext.setVisible(false);
                btn2.setVisible(false);

                tf.setVisible(true);
                tf.setEditable(false);
                alarmscroll.setVisible(true);

                btn1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        String find = searchtext.getText();
                        String str = ta.getText();
                        pos = str.indexOf(find, fromindex);
                        if(pos == -1)
                        {
                            pos = 0;
                            fromindex = 0;
                            pos = str.indexOf(find,  fromindex);
                            tf.append("단어를 모두 찾았습니다. 처음부터 단어를 찾습니다.\r\n" + find + " 단어의 위치 :: " + pos );
                            tf.append("\r\n");
                            fromindex = pos + find.length();

                        }

                        else
                        {
                            fromindex = pos + find.length();

                            tf.append(find + " 단어의 위치 :: " + pos );
                            tf.append("\r\n");
                        }

                    }

                });
            }

        });

        replaceItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                // 프레임 사이즈를 늘린다.
                frame.setSize(800,860);

                searchtext.setVisible(true);
                btn1.setVisible(true);

                replacetext.setVisible(true);
                btn2.setVisible(true);

                tf.setVisible(true);
                tf.setEditable(false);
                alarmscroll.setVisible(true);

                btn1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){


                        // 찾을 단어를 가져온다.
                        String find = searchtext.getText();

                        // 메모장의 내용을 가져온다.
                        String str = ta.getText();

                        // 단어를 가리킬 위치의 첫 부분은 pos로 정한다.
                        pos = str.indexOf(find, fromindex);

                        // 만약 끝까지 찾았다면 0에서 다시 찾도록 한번더 기회준다.
                        if(pos == -1)
                        {
                            pos = 0;
                            fromindex = 0;
                            pos = str.indexOf(find,  fromindex);
                            tf.append("단어를 모두 찾았습니다. 처음부터 단어를 찾습니다.\r\n" + find + " 단어의 위치 :: " + pos );
                            tf.append("\r\n");
                            fromindex = pos + find.length();

                        }

                        else
                        {
                            fromindex = pos + find.length();

                            tf.append(find + " 단어의 위치 :: " + pos );
                            tf.append("\r\n");
                        }

                    }

                });


                btn2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        String find = searchtext.getText();
                        String replace = replacetext.getText();
                        String str = ta.getText();
                        pos = str.indexOf(find, fromindex);
                        if(pos == -1)
                        {
                            pos = 0;
                            fromindex = 0;
                            tf.append("마지막 위치까지 단어를 모두 바꾸었습니다. \r\n아직 남아있다면 바꾸기 버튼을 다시 누르시고, 처음부터 다시 검색하여 바꿉니다.\r\n");
                            tf.append("\r\n");
                        }

                        else
                        {
                            fromindex = pos + find.length();
                            ta.replaceRange(replace, pos, pos+find.length());
                            tf.append(find + " 단어의 위치 :: " + pos );
                            tf.append("\r\n");
                        }

                    }

                });

            }

        });

        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }


    public static void setUIFont(FontUIResource font)
    {
        Enumeration keys = UIManager.getDefaults().keys();
        while(keys.hasMoreElements())
        {
            Object Key = keys.nextElement();
            Object value = UIManager.get(Key);
            if(value instanceof FontUIResource)
            {
                FontUIResource orig = (FontUIResource)value;
                Font font1 = new Font(font.getName(),orig.getStyle(),font.getSize());
                UIManager.put(Key,new FontUIResource(font));
            }
        }
    }

    public static void main(String[] args)
    {
        new NotePad();
    }
    static String content = "";
    static int flag = 0;
    static int pos = 0;
    static int fromindex = 0;
}
