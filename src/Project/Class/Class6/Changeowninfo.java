package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Changeowninfo extends JPanel implements ActionListener, ItemListener {
    private JButton change;
    private JLabel[] jl1 = new JLabel[14];
    private JTextField[] jtf1 = new JTextField[16];
    private String[] st1 = {"", "重复密码", "姓名", "联系方式", "电子邮箱", "付款方式", "", "职业", "省份", "性别", "公司", "公司邮箱", "邮编"};
    private JPasswordField psd,psd2;
    private JRadioButton man,woman;
    private JComboBox province,career;
    private String s1,s2,s3,s4,s5,s6,s7,s8,s9, s10;

    public Changeowninfo(){
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        JPanel p3 = new JPanel();
        p1.add(p3, "South");

        change = new JButton("修改");
        p3.add(change);
        change.addActionListener(this);

        JPanel p4 = new JPanel(new GridLayout(14, 1));
        p1.add(p4, "West");
        for (int i = 0; i < 14; i++) {
            jl1[i] = new JLabel(st1[i]);
            p4.add(jl1[i]);
        }

        JPanel p5 = new JPanel(new GridLayout(1, 2, 0, 20));
        p1.add(p5, "Center");
        JPanel p6 = new JPanel(new GridLayout(14, 1));
        p5.add(p6);
        p6.add(new JLabel());
        psd = new JPasswordField("123");
        p6.add(psd);
        psd2 = new JPasswordField("132");
        p6.add(psd2);

        String[] st2 = {"aaa", "1231234", "aaa@t.com"};
        for (int i = 0; i < 3; i++) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
