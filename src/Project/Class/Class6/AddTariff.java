package Project.Class.Class6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTariff extends JPanel implements ActionListener {

    private JPanel p1;
    private JTextField[] jt = new JTextField[4];
    private String[] st1 = {"资费名称", "月租费用", "每小时费用", "资费描述"};
    private JButton[] b = new JButton[2];

    public AddTariff(){
        p1 = new JPanel(new BorderLayout());//默认布局,分为5个区域
        p1.add(new JLabel("添加新的资费政策", JLabel.CENTER), "North");//添加至上部
        JPanel p2 = new JPanel(new GridLayout(1, 2));
        JPanel p3 = new JPanel(new GridLayout(4, 2));
        p1.add(p2);
        p2.add(p3);//p2中第一行第一列方p3

        for (int i = 0; i < jt.length; i++) {
            p3.add(new JLabel(st1[i]));
            jt[i] = new JTextField();
            p3.add(jt[i]);
        }

        JPanel p4 = new JPanel(new GridLayout(4, 1));
        p2.add(p4);
        String[] st2 = {"请输入新建资费名称", "请选择新建的月租费用", "请输入每小时的费用", "请输入对新建资费的简单描述"};

        for (String s : st2) {
            p4.add(new JLabel(s));
        }

        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        String[] st3 = {"提交", "清除"};

        for (int i = 0; i < b.length; i++) {
            b[i] = new JButton(st3[i]);
            p5.add(b[i]);
            b[i].addActionListener(this);
        }
        p1.add(p5, "South");
        this.add(p1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b[0]) {
            try{
                Connection con;
                Statement stmt;
                con = DBAPI.getConnection();
                stmt = con.createStatement();
                String s1,s2;
                s1 = jt[1].getText();
                s2 = "月租" + jt[1].getText() + "元" + "," + "每小时" + jt[2].getText() + "元";
                jt[3].setText(s2);
                stmt.executeUpdate("INSERT INTO sourse(name, month_rent, hour_spent, introduce)" + "VALUES('" + jt[0].getText() +"','"
                + jt[1].getText() + "','" + jt[2].getText() + "','"+ s2 +"'" + ")");
                stmt.close();
                con.close();
                this.setVisible(false);
                this.removeAll();
                this.add(new TariffList());
                this.setVisible(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == b[1]) {
            for (JTextField jtf : jt) {
                jtf.setText("");
            }
        }
    }
}
