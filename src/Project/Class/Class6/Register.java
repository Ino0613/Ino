package Project.Class.Class6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Register extends JFrame implements ActionListener, ItemListener {

    private JFrame app;
    private JTextField username,userpwd,userpwd2,name,tel,email;
    private JRadioButton man, woman;
    private JRadioButton rankpay, moneypay, remit,other;
    private JComboBox province,stats;
    private JButton next,refill;
    private Dialog dialog;

    public Register(){
        app = new JFrame("现在注册");
        app.setSize(600, 500);
        app.setLocation(200, 140);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = app.getContentPane();

        c.setLayout(new GridLayout(1, 3));
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(12,1,0,10));
        p1.add(new JLabel("注册步骤"));
        p1.add(new JLabel("一、阅读并同意协议"));
        p1.add(new JLabel("二、填写表单"));
        p1.add(new JLabel("三、完成注册"));
        c.add(p1);

        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        c.add(p2);
        c.add(p3);
        p2.setLayout(new GridLayout(12, 1, 0, 10));
        p3.setLayout(new GridLayout(12, 1, 0, 10));

        p2.add(new JLabel("用户名"));
        username = new JTextField(10);
        p3.add(username);
        p2.add(new JLabel("性别"));
        ButtonGroup sex = new ButtonGroup();
        man = new JRadioButton("男", true);
        sex.add(man);
        woman = new JRadioButton("女", false);
        sex.add(woman);
        JPanel p31 = new JPanel();
        p31.setLayout(new GridLayout(1, 2));
        p31.add(man);
        p31.add(woman);

        p3.add(p31);
        p2.add(new JLabel("密码"));
        userpwd = new JPasswordField(10);
        p3.add(userpwd);
        p2.add(new JLabel("确认密码"));
        userpwd2 = new JPasswordField(10);
        p3.add(userpwd2);

        p2.add(new JLabel("姓名："));
        name = new JTextField(10);
        p3.add(name);
        p2.add(new JLabel("联系电话："));
        tel = new JTextField(10);
        p3.add(tel);
        p2.add(new JLabel("省份："));
        Object provinces[] = {"北京", "上海", "太原"};
        province = new JComboBox(provinces);
        p3.add(province);

        p2.add(new JLabel("付费方式"));
        ButtonGroup way = new ButtonGroup();
        rankpay = new JRadioButton("银行转账");
        way.add(rankpay);
        moneypay = new JRadioButton("现金支付");
        way.add(moneypay);
        remit = new JRadioButton("邮政汇款");
        way.add(remit);
        other = new JRadioButton("其他");
        way.add(other);

        JPanel p32 = new JPanel();
        p32.setLayout(new GridLayout(1, 4));
        p32.add(rankpay);
        p32.add(moneypay);
        p32.add(remit);
        p32.add(other);

        p3.add(p32);
        p2.add(new JLabel("开通状态"));
        Object zhuangtai[] = {"开通", "未开通"};
        stats = new JComboBox(zhuangtai);
        p3.add(stats);
        stats.addItemListener(this);

        p2.add(new JLabel("E-mail地址"));
        email = new JTextField(10);
        p3.add(email);
        next = new JButton("下一步");
        p2.add(next);
        next.addActionListener(this);
        refill = new JButton("重新填写");
        p3.add(refill);
        refill.addActionListener(this);
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (userpwd.getText().equals(userpwd2.getText())) {
            if (e.getSource() == next) {
                Connection con;
                Statement stmt;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
                try {
                    con = DBAPI.getConnection();
                    stmt = con.createStatement();
                    String xb = "";
                    if (man.isSelected()) {
                        xb = man.getText();
                    }
                    if (woman.isSelected()) {
                        xb = woman.getText();
                    }
                    String sf = "";
                    if (province.getSelectedIndex() == 0) {
                        sf = "太原";
                    }
                    if (province.getSelectedIndex() == 1) {
                        sf = "北京";
                    }
                    if (province.getSelectedIndex() == 2) {
                        sf = "上海";
                    }
                    String fs = "";
                    if (rankpay.isSelected())
                        fs = "银行转账";
                    if (moneypay.isSelected())
                        fs = "现金支付";
                    if (remit.isSelected())
                        fs = "邮政汇款";
                    if (other.isSelected())
                        fs = "其他";
                    String zt = "";
                    if (stats.getSelectedIndex() == 0) {
                        zt = "开通";
                    }
                    if (stats.getSelectedIndex() == 1) {
                        zt = "未开通";
                    }
                    String sqlstr = "INSERT INTO consumer" + "(id,sex,password,name,telephone,province,method,state,mail)" +
                            "VALUES (" + "'" + username.getText() + "'" + "," + "'" + xb + "'" + "," + "'" + userpwd.getText() +
                            "'" + "," + "'" + name.getText() + "'" + "," + "'" + tel.getText() + "'" + "," + "'" + sf + "'" + "," + "'" +
                            fs + "'" + "," + "'" + zt + "'" + "," + "'" + email.getText() + "'" + ")";
                    stmt.executeUpdate(sqlstr);
                    stmt.close();
                    con.close();
                    new Login();
                    app.setVisible(false);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("加载失败！");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "对不起两次密码输入不同，请重新输入！", "系统提示", JOptionPane.INFORMATION_MESSAGE);
            username.setText("");
            userpwd.setText("");
            userpwd2.setText("");
            name.setText("");
            tel.setText("");
            email.setText("");
            this.setVisible(false);
        }
        if (e.getSource() == refill) {
            username.setText("");
            userpwd.setText("");
            userpwd2.setText("");
            name.setText("");
            tel.setText("");
            email.setText("");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
