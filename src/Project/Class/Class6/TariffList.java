package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TariffList extends JPanel implements ActionListener {

    private JButton jb1,jb2,jb3;
    private JTable jt;
    private JPanel p1;

    public TariffList(){
        p1 = new JPanel(new BorderLayout());
        p1.add(new JLabel("以下是资费列表", JLabel.CENTER), "North");
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipttm?characterEncoding=utf8&useSSL=false", "root", "Zhang010613.");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM sourse");
            rs.last();
            int k = rs.getRow();
            if (k == 0) {
                JOptionPane.showMessageDialog(this, "您查询的表为空表！", "系统提示", JOptionPane.WARNING_MESSAGE);
            }
            rs.beforeFirst();
            String[][] obj = new String[k][4];
            for (int i = 0; (i < k) && (rs.next()); i++) {
                obj[i][0] = rs.getString("name");
                obj[i][1] = rs.getString("month_rent");
                obj[i][2] = rs.getString("hour_spent");
                obj[i][3] = rs.getString("introduce");
            }
            String[] st = {"资费名称", "月租费用", "小时费用", "自费说明"};
            jt = new JTable(obj, st);
            jt.setSize(600, 300);
            JScrollPane jsp = new JScrollPane(jt);
            jsp.setPreferredSize(new Dimension(jt.getWidth() - 100, jt.getHeight() - 100));
            p1.add(jsp, "Center");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        jb1 = new JButton("提交");
        jb1.addActionListener(this);
        jb2 = new JButton("清除");
        jb3 = new JButton("修改");
        jb3.addActionListener(this);
        JPanel p5 = new JPanel(new FlowLayout());
        p5.add(jb1);
        p5.add(jb2);
        p5.add(jb3);
        p1.add(p5, "South");
        jb2.addActionListener(this);
        add(p1);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        removeAll();
        add(new TariffManage_New());
        setVisible(true);
    }
}
