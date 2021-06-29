import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/*
 * Created by Daniel Mo on Mon Jun 28 03:28:38 CST 2021
 */


/**
 * @author Yuxuan Yan, Chengyu Yang,Daniel Mo
 */
public class ChatForm extends JPanel {
    public ChatForm() {
        initComponents();
    }

    public static void createFrame() {
       ChatForm CF = new ChatForm();
       CF.setVisible(true);
    }

    public static void main(String[] args) {
//        JFrame.setDefaultLookAndFeelDecorated(true);
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               createFrame();
           }
       });
    }

    private boolean isConnected = false;

    private void sendButtonActionPerformed(ActionEvent e) {
        send();
    }

    private void sendButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // 修改样式时严格注意组件溢出以及layout排布  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        panel2 = new JPanel();
        refreshButton = new JButton();
        settingButton = new JButton();
        formattedTextField1 = new JFormattedTextField();
        scrollPane1 = new JScrollPane();
        list1 = new JList<>();
        panel3 = new JPanel();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        panel4 = new JPanel();
        textField1 = new JTextField();
        sendButton = new JButton();

        //======== this ========
        setBackground(new Color(32, 34, 37));
        setPreferredSize(new Dimension(900, 680));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new Dimension(900, 680));
        setMaximumSize(new Dimension(900, 680));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(32, 34, 37));
            panel1.setAlignmentX(0.0F);
            panel1.setAlignmentY(0.0F);
            panel1.setAutoscrolls(true);
            panel1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
            panel1.setPreferredSize(new Dimension(200, 680));
            panel1.setMinimumSize(new Dimension(200, 680));
            panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(32, 34, 37));
                panel2.setPreferredSize(new Dimension(200, 39));
                panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 5));

                //---- refreshButton ----
                refreshButton.setText("\u5237\u65b0");
                refreshButton.setBackground(new Color(47, 49, 54));
                refreshButton.setForeground(Color.darkGray);
                refreshButton.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 14));
                refreshButton.setAlignmentY(0.0F);
                refreshButton.setMargin(new Insets(0, 0, 0, 0));
                refreshButton.setMinimumSize(new Dimension(60, 29));
                refreshButton.setPreferredSize(new Dimension(60, 29));
                panel2.add(refreshButton);

                //---- settingButton ----
                settingButton.setText("\u8bbe\u7f6e");
                settingButton.setBackground(new Color(47, 49, 54));
                settingButton.setForeground(Color.darkGray);
                settingButton.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 14));
                settingButton.setAlignmentY(0.0F);
                settingButton.setPreferredSize(new Dimension(60, 29));
                settingButton.setMargin(new Insets(0, 0, 0, 0));
                settingButton.setMinimumSize(new Dimension(60, 29));
                panel2.add(settingButton);
            }
            panel1.add(panel2);

            //---- formattedTextField1 ----
            formattedTextField1.setBackground(new Color(47, 49, 54));
            formattedTextField1.setSelectedTextColor(Color.white);
            formattedTextField1.setText("\u641c\u7d22\u7528\u6237");
            formattedTextField1.setForeground(Color.white);
            formattedTextField1.setAlignmentX(0.0F);
            formattedTextField1.setAlignmentY(0.0F);
            formattedTextField1.setMinimumSize(new Dimension(11, 35));
            formattedTextField1.setPreferredSize(new Dimension(200, 35));
            formattedTextField1.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 16));
            formattedTextField1.setCaretColor(Color.white);
            formattedTextField1.setBorder(null);
            panel1.add(formattedTextField1);

            //======== scrollPane1 ========
            {
                scrollPane1.setFocusable(false);
                scrollPane1.setBackground(new Color(32, 34, 37));
                scrollPane1.setForeground(new Color(32, 34, 37));
                scrollPane1.setAlignmentY(0.0F);
                scrollPane1.setAlignmentX(0.0F);
                scrollPane1.setPreferredSize(new Dimension(200, 600));
                scrollPane1.setBorder(null);

                //---- list1 ----
                list1.setBackground(new Color(32, 34, 37));
                list1.setForeground(Color.white);
                list1.setPreferredSize(new Dimension(35, 600));
                list1.setBorder(null);
                list1.setModel(new AbstractListModel<String>() {
                    String[] values = {
                        "user1",
                        "user2",
                        "user3"
                    };
                    @Override
                    public int getSize() { return values.length; }
                    @Override
                    public String getElementAt(int i) { return values[i]; }
                });
                list1.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 14));
                scrollPane1.setViewportView(list1);
            }
            panel1.add(scrollPane1);
        }
        add(panel1);

        //======== panel3 ========
        {
            panel3.setAlignmentX(0.0F);
            panel3.setAlignmentY(0.0F);
            panel3.setPreferredSize(new Dimension(700, 680));
            panel3.setMinimumSize(new Dimension(100, 680));
            panel3.setBackground(new Color(32, 34, 37));
            panel3.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("\u5c40\u57df\u7f51\u5e7f\u64ad");
            label1.setBackground(new Color(32, 34, 37));
            label1.setForeground(Color.white);
            label1.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.BOLD, 20));
            label1.setMaximumSize(new Dimension(700, 50));
            label1.setMinimumSize(new Dimension(100, 50));
            label1.setPreferredSize(new Dimension(100, 75));
            label1.setHorizontalTextPosition(SwingConstants.CENTER);
            label1.setAlignmentY(0.0F);
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            panel3.add(label1, BorderLayout.NORTH);

            //======== scrollPane2 ========
            {
                scrollPane2.setAlignmentX(0.0F);
                scrollPane2.setAlignmentY(0.0F);
                scrollPane2.setPreferredSize(new Dimension(700, 550));
                scrollPane2.setMinimumSize(new Dimension(700, 550));
                scrollPane2.setBackground(new Color(60, 60, 60));
                scrollPane2.setForeground(new Color(60, 60, 60));
                scrollPane2.setBorder(null);

                //---- textArea1 ----
                textArea1.setBackground(new Color(60, 60, 60));
                textArea1.setSelectedTextColor(Color.white);
                textArea1.setText("\u6b63\u5728\u8fde\u63a5\u670d\u52a1\u5668...");
                textArea1.setForeground(Color.white);
                textArea1.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 14));
                textArea1.setPreferredSize(new Dimension(700, 17));
                textArea1.setEditable(false);
                textArea1.setLineWrap(true);
                scrollPane2.setViewportView(textArea1);
            }
            panel3.add(scrollPane2, BorderLayout.CENTER);

            //======== panel4 ========
            {
                panel4.setBackground(new Color(50, 50, 50));
                panel4.setPreferredSize(new Dimension(600, 55));
                panel4.setMinimumSize(new Dimension(600, 50));
                panel4.setBorder(null);
                panel4.setAlignmentY(10.0F);
                panel4.setAlignmentX(5.0F);
                panel4.setLayout(new GridBagLayout());
                ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 0, 0};
                ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0E-4};
                ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- textField1 ----
                textField1.setMinimumSize(new Dimension(690, 50));
                textField1.setAlignmentX(0.0F);
                textField1.setAlignmentY(0.0F);
                textField1.setPreferredSize(new Dimension(600, 50));
                textField1.setBackground(new Color(50, 50, 50));
                textField1.setForeground(Color.white);
                textField1.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 14));
                textField1.setHorizontalAlignment(SwingConstants.LEFT);
                textField1.setAutoscrolls(false);
                textField1.setSelectedTextColor(Color.white);
                textField1.setCaretColor(Color.white);
                textField1.setBorder(null);
                panel4.add(textField1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- sendButton ----
                sendButton.setText("\u53d1\u9001");
                sendButton.setFont(new Font("\u82f9\u65b9\u5b57\u4f53", Font.PLAIN, 12));
                sendButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        sendButtonMouseClicked(e);
                    }
                });
                sendButton.addActionListener(e -> sendButtonActionPerformed(e));
                panel4.add(sendButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel3.add(panel4, BorderLayout.SOUTH);
        }
        add(panel3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JPanel panel2;
    private JButton refreshButton;
    private JButton settingButton;
    private JFormattedTextField formattedTextField1;
    private JScrollPane scrollPane1;
    private JList<String> list1;
    private JPanel panel3;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JPanel panel4;
    private JTextField textField1;
    private JButton sendButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    // 执行发送
    public void send() {
        if (!isConnected) {
            JOptionPane.showMessageDialog(null, "还没有连接服务器，无法发送消息！", "错误",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String message = textField1.getText().trim();
        if (message == null || message.equals("")) {
            JOptionPane.showMessageDialog(null, "消息不能为空！", "错误",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //        sendMessage(label1.getText() + "@" + "ALL" + "@" + message);
        textField1.setText(null);
    }
}
