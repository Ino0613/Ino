package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login implements ActionListener {

    private JFrame app;
    private JButton login,clear,register,reinput,exit;
    private JLabel username,userkoling;
    private JTextField userid;
    private JPasswordField userpsd;
    private JDialog tips;
    private int message = 0;

    public Login(){
        app = new JFrame("IP电信资费管理系统");
        app.setSize(250, 250);
        app.setLocation(360, 240);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = app.getContentPane();
        c.setLayout(new FlowLayout());
        username = new JLabel("用户姓名");
        c.add(username);

        userid = new JTextField(10);
        c.add(userid);

        userkoling = new JLabel("用户口令");
        c.add(userkoling);

        userpsd = new JPasswordField(10);
        c.add(userpsd);

        login = new JButton("登录");
        c.add(login);
        login.addActionListener(this);

        clear = new JButton("清除");
        c.add(clear);
        clear.addActionListener(this);

        tips = new JDialog();
        tips.setSize(340, 80);
        tips.setLocation(app.getX() + 100, app.getY() + 100);
        tips.setLayout(new FlowLayout());
        tips.add(new JLabel("重新输入还是退出！"));

        reinput = new JButton("重新输入");
        tips.add(reinput);
        reinput.addActionListener(this);


        exit = new JButton("退出");
        tips.add(exit);
        exit.addActionListener(this);
        c.add(new JLabel("如果你还没注册，请注册"));

        register = new JButton("注册");
        c.add(register);
        register.addActionListener(this);
        app.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if (e.getSource() == login) {
            Connection con = null;
            Statement stmt;
            ResultSet rs;

            try {
                con = DBAPI.getConnection();
                stmt = con.createStatement();
                rs = stmt.executeQuery("select * from consumer");
                while (rs.next()) {
                    String s1 = rs.getString("id");
                    String s2 = rs.getString("password");
                    char[] ps = userpsd.getPassword();
                    String s3 = "";
                    for (int i = 0; i < ps.length; i++) {
                        s3 += ps[i];
                    }

                    if ((userid.getText().equals(s1)) && (s3.equals(s2))) {
                        message = 1;
                        new Main();
                        app.setVisible(false);
                        rs.close();
                        stmt.close();
                        con.close();
                        break;
                    }
                }
                if (message == 0) {
                    JOptionPane.showMessageDialog(app, "您输入的账号或密码有误，请重新输入！" , "系统提示", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("加载失败！");
            }
        }

        if (e.getSource() == clear) {
            tips.setVisible(true);
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
        if (e.getSource() == reinput) {
            username.setText("");
            userpsd.setText("");
            tips.setVisible(false);
        }
        if (e.getSource() == register) {
            new Register();
            app.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
