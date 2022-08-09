package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class Main implements ActionListener {

    private JButton UserManage,TariffManage,BillManage,AccountManage,AdminManage,Userservice, ExitSystem;
    private JPanel p3;

    public Main(){
        JFrame app = new JFrame("系统主界面");
        Container c = app.getContentPane();
        c.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        c.add(p1, "West");
        p1.setLayout(new GridLayout(2, 1));
        JPanel p2 = new JPanel(new GridLayout(7, 1));
        p1.add(p2);

        UserManage = new JButton("用户管理");
        p2.add(UserManage);
        UserManage.addActionListener(this);

        TariffManage = new JButton("资费管理");
        p2.add(TariffManage);
        TariffManage.addActionListener(this);

        BillManage = new JButton("账单管理");
        p2.add(BillManage);
        BillManage.addActionListener(this);

        AdminManage = new JButton("管理员管理");
        p2.add(AdminManage);
        AdminManage.addActionListener(this);

        Userservice = new JButton("用户自服务");
        p2.add(Userservice);
        Userservice.addActionListener(this);

        ExitSystem = new JButton("退出系统");
        p2.add(ExitSystem);
        ExitSystem.addActionListener(this);

        p3 = new JPanel();
//        ImageIcon icon = new ImageIcon("123.jif");
//        JLabel cp1 = new JLabel(icon);
//        cp1.setSize(500, 300);
//        p3.add(cp1);

        JScrollPane spane = new JScrollPane(p3);
        c.add(spane, "Center");
        JPanel p5 = new JPanel(new GridLayout(3, 1));
        p5.setBackground(Color.GREEN);
        c.add(p5, "South");
        p5.add(new JLabel("山西农业大学信息学院", JLabel.CENTER));
        p5.add(new JLabel("软件2001班", JLabel.CENTER));
        p5.add(new JLabel("版权所有 (c) 2022", JLabel.CENTER));
        JPanel p6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p6.setBackground(Color.YELLOW);
        c.add(p6, "North");
        JLabel huanying = new JLabel("欢迎使用本公司业务");
        huanying.setFont(new Font("华文行楷", 1, 30));
        huanying.setForeground(Color.RED);
        p6.add(huanying, JLabel.CENTER);
        app.setSize(700, 640);
        app.setLocation(100, 80);
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == UserManage) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new UserManager());
            p3.setVisible(true);
        }
        if (e.getSource() == TariffManage) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new TariffManage());
            p3.setVisible(true);
        }
        if (e.getSource() == BillManage) {
            p3.setVisible(false);
            p3.removeAll();
            //p3.add(new BillManage());
            p3.setVisible(true);
        }
        if (e.getSource() == AccountManage) {
            p3.setVisible(false);
            p3.removeAll();
            //p3.add(new AccountManage());
            p3.setVisible(true);
        }
        if (e.getSource() == AdminManage) {
            p3.setVisible(false);
            p3.removeAll();
            //p3.add(new AdminManage());
            p3.setVisible(true);
        }
        if (e.getSource() == Userservice) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new Userservice());
            p3.setVisible(true);
        }
        if (e.getSource() == ExitSystem) {
            System.exit(10);
        }
    }

//    public static void main(String[] args) {
//        new Admin();
//    }
}
