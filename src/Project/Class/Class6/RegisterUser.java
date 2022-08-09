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

public class RegisterUser extends JPanel implements ActionListener, ItemListener {

    private JButton submit,refill;
    private JTextField FinanceAccount,Fpsd,Fpsd2,username,mail,telephone,company,cmail,code;
    private JRadioButton man,woman,open,pause;
    private JComboBox payway,province,career;
    private String s1,s2,s3;

    public RegisterUser(){
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        JPanel p2 = new JPanel();
        p1.add(p2, "North");
        JLabel tips = new JLabel("请输入用户信息，带*的必须填写！");
        p2.add(tips, JLabel.CENTER);
        tips.setFont(new Font("华文行楷", 1, 30));
        tips.setForeground(Color.RED);

        JPanel p3 = new JPanel();
        p1.add(p3, "South");
        submit = new JButton("提交");
        p3.add(submit);
        submit.addActionListener(this);

        refill = new JButton("重设");
        p3.add(refill);
        refill.addActionListener(this);

        JPanel p4 = new JPanel(new GridLayout(15, 3));
        p1.add(p4, "Center");

        p4.add(new JLabel("账务账号*"));
        FinanceAccount = new JTextField();
        p4.add(FinanceAccount);
        p4.add(new JLabel("请输入用户的账务账号名称"));

        p4.add(new JLabel("账务密码*"));
        Fpsd = new JTextField();
        p4.add(Fpsd);
        p4.add(new JLabel("请输入用户的账务密码"));

        p4.add(new JLabel("重复密码*"));
        Fpsd2 = new JTextField();
        p4.add(Fpsd2);
        p4.add(new JLabel("请重复以上密码"));

        p4.add(new JLabel("用户名称*"));
        username = new JTextField();
        p4.add(username);
        p4.add(new JLabel("请输入用户的真实姓名"));

        p4.add(new JLabel("性别选项"));
        JPanel p5 = new JPanel(new GridLayout(1, 2));
        p4.add(p5);
        ButtonGroup bg1 = new ButtonGroup();

        man = new JRadioButton("男", true);
        bg1.add(man);
        p5.add(man);

        woman = new JRadioButton("女");
        bg1.add(woman);
        p5.add(woman);

        p4.add(new JLabel());
        p4.add(new JLabel("付款方式"));
        Object[] way = {"现金支付", "银行转账", "邮政汇款", "其他"};
        payway = new JComboBox(way);
        p4.add(payway);
        payway.addActionListener(this);

        p4.add(new JLabel());
        p4.add(new JLabel("用户状态"));
        JPanel p6 = new JPanel(new GridLayout(1, 2));
        p4.add(p6);
        ButtonGroup gp2 = new ButtonGroup();

        open = new JRadioButton("开通", true);
        gp2.add(open);
        p6.add(open);

        pause = new JRadioButton("暂停");
        gp2.add(pause);
        p6.add(pause);

        p4.add(new JLabel());
        p4.add(new JLabel("电子邮箱"));
        mail = new JTextField("@126.com");
        p4.add(mail);
        p4.add(new JLabel("请输入正确的电子邮箱信息"));

        p4.add(new JLabel("省份"));
        Object[] provinces = {"北京", "上海", "河南", "河北", "西藏", "太原", "其他"};
        province = new JComboBox(provinces);
        p4.add(province);
        province.addActionListener(this);

        p4.add(new JLabel());
        p4.add(new JLabel("职业"));
        Object[] zhiye = {"公务员", "事业单位", "企业", "其他"};
        career = new JComboBox(zhiye);
        p4.add(career);
        career.addActionListener(this);

        p4.add(new JLabel());
        p4.add(new JLabel("联系电话"));
        telephone = new JTextField();
        p4.add(telephone);
        p4.add(new JLabel("请输入用户电话"));

        p4.add(new JLabel("公司"));
        company = new JTextField();
        p4.add(company);
        p4.add(new JLabel("请输入用户所在单位信息"));

        p4.add(new JLabel("公司邮箱"));
        cmail = new JTextField("@163.com");
        p4.add(cmail);
        p4.add(new JLabel("请输入用户所在单位邮箱号码"));

        p4.add(new JLabel("邮政编码"));
        code = new JTextField();
        p4.add(code);
        p4.add(new JLabel("*请输入用户邮政编码"));
        this.add(p1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (Fpsd.getText().equals(Fpsd2.getText())) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                String xb = "";
                if (man.isSelected())
                    xb = "男";
                if (woman.isSelected())
                    xb = "女";
                String zt = "";
                if (open.isSelected())
                    zt = "开通";
                if (pause.isSelected())
                    zt = "暂停";

                Connection con;
                Statement stmt;
                try {
                    con = DBAPI.getConnection();
                    stmt = con.createStatement();
                    String sql = "INSERT INTO consumer(id,sex,password,name,telephone,province,method,state,mail,job," +
                            "company,mail2,post) " + "VALUES(" + "'" + FinanceAccount.getText() + "'" + "," + "'" + xb + "'" + ","
                            + "'" + Fpsd.getText() + "'" + "," + "'" + username.getText() + "'" + "," + "'" + telephone.getText() + "'" +
                            "," + "'" + s2 + "'" + "," + "'" + s1 + "'" + "," + "'" + zt + "'" + "," + "'" + mail.getText() + "'" + "," + "'" + s3 + "'" +
                            "," + "'" + company.getText() + "'" + "," + "'" + cmail.getText() + "'" + "," + "'" + code.getText() + "'" + ")";
                    stmt.executeUpdate(sql);
                    stmt.close();
                    con.close();
                    this.setVisible(false);
                    this.removeAll();
                    this.add(new UserList());
                    this.setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (!Fpsd.getText().equals(Fpsd2.getText())) {
                JOptionPane.showMessageDialog(this, "您输入的重复密码不正确，请重新输入!", "系统提示", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == refill) {
            FinanceAccount.setText("");
            Fpsd.setText("");
            Fpsd2.setText("");
            username.setText("");
            mail.setText("");
            telephone.setText("");
            company.setText("");
            cmail.setText("");
            code.setText("");
        }
    }



    @Override
    public void itemStateChanged(ItemEvent e) {
        if (payway.getSelectedIndex() == 0)
            s1 = "现金支付";
        if (payway.getSelectedIndex() == 1)
            s1 = "银行转账";
        if (payway.getSelectedIndex() == 2)
            s1 = "邮政汇款";
        if (payway.getSelectedIndex() == 3)
            s1 = "其他";
        if (province.getSelectedIndex() == 0)
            s2 = "北京";
        if (province.getSelectedIndex() == 1)
            s2 = "上海";
        if (province.getSelectedIndex() == 2)
            s2 = "河南";
        if (province.getSelectedIndex() == 3)
            s2 = "河北";
        if (province.getSelectedIndex() == 4)
            s2 = "西藏";
        if (province.getSelectedIndex() == 5)
            s2 = "太原";
        if (province.getSelectedIndex() == 6)
            s2 = "其他";
        if (career.getSelectedIndex() == 0)
            s3 = "公务员";
        if (career.getSelectedIndex() == 1)
            s3 = "事业单位";
        if (career.getSelectedIndex() == 2)
            s3 = "企业";
        if (career.getSelectedIndex() == 3)
            s3 = "其他";
    }

}
