package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserManager extends JPanel implements ActionListener {

    private JButton RegisterUser,UserList,Inquire;
    private JTextField FinanceAccount;
    private JPanel p1,p2,p3,p4,p5;
    private JButton[] jb = new JButton[3];
    private JScrollPane jsp1;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private int message = 0;

    public UserManager(){
        p1 = new JPanel(new BorderLayout());
        p2 = new JPanel();
        p1.add(p2, "North");
        p2.setLayout(new GridLayout(1, 5, 30, 0));

        RegisterUser = new JButton("开通账户");
        RegisterUser.addActionListener(this);
        p2.add(RegisterUser);

        UserList = new JButton("用户列表");
        UserList.addActionListener(this);
        p2.add(UserList);

        FinanceAccount = new JTextField();
        p2.add(new JLabel("账务账号"));
        p2.add(FinanceAccount);

        Inquire = new JButton("查询");
        Inquire.addActionListener(this);
        p2.add(Inquire);

        p4 = new JPanel(new BorderLayout());
        p5 = new JPanel(new GridLayout(17, 1));
        p4.add(p5, "East");
        String[] s2 = {"恢复", "暂停", "删除"};

        for (int i = 0; i < jb.length; i++) {
            jb[i] = new JButton(s2[i]);
            jb[i].addActionListener(this);
            p5.add(jb[i]);
        }

        p3 = new JPanel();
        p1.add(p3, "Center");
        p3.add(new UserList());
        this.add(p1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            con = DBAPI.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from consumer");
            while (rs.next()) {
                String s1 = rs.getString("id");
                String s2 = FinanceAccount.getText();
                if (s2.equals(s1)) {
                    message = 1;
                    Object[][] ob = new Object[1][6];
                    String[] st1 = {"账号", "姓名", "电话", "邮箱", "性别", "状态"};
                    ob[0][0] = s1;
                    ob[0][1] = rs.getString("name");
                    ob[0][2] = rs.getString("telephone");
                    ob[0][3] = rs.getString("mail");
                    ob[0][4] = rs.getString("sex");
                    ob[0][5] = rs.getString("state");

                    JTable t1 = new JTable(ob, st1);
                    t1.setSize(300, 200);
                    jsp1 = new JScrollPane(t1);
                    jsp1.setPreferredSize(new Dimension(t1.getWidth(), t1.getHeight()));
                    p4.add(jsp1, "Center");

                    if (e.getSource() == jb[0]) {
                        String s3 = "UPDATE consumer SET state = '开通' WHERE id = '" + s2 + "'";
                        stmt.executeUpdate(s3);
                    }
                    if (e.getSource() == jb[1]) {
                        String s3 = "UPDATE consumer SET state = '暂停' WHERE id = '" + s2 + "'";
                        stmt.executeUpdate(s3);
                    }
                    if (e.getSource() == jb[2]) {
                        String s3 = "DELETE from consumer WHERE id = '" + s2 + "'";
                        stmt.executeUpdate(s3);
                    }
                    p3.setVisible(false);
                    p3.removeAll();
                    p3.add(new UserList());
                    break;
                }
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (e.getSource() == RegisterUser) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new RegisterUser());
            p3.setVisible(true);
        }
        if (e.getSource() == UserList) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new UserList());
            p3.setVisible(true);
        }
        if (e.getSource() == Inquire) {
            if (message == 0) {
                JOptionPane.showMessageDialog(this, "您查询的用户不存在！", "兄台那个提示", JOptionPane.WARNING_MESSAGE);
            }else{
                p3.setVisible(false);
                p3.removeAll();
                p3.add(p4);
                p3.setVisible(true);
            }

        }
    }
}
