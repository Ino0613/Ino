package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UserList extends JPanel implements ActionListener {

    private JTable m_view;
    private JPanel p1,p2, p3;

    public UserList(){
        JPanel p1 = new JPanel(new BorderLayout());
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ipttm?characterEncoding=utf8&useSSL=false", "root", "Zhang010613.");
            stmt = con.createStatement(1005, 1008);
            rs = stmt.executeQuery("SELECT * FROM consumer");
            rs.last();
            int k = rs.getRow();
            if (k == 0) {
                JOptionPane.showMessageDialog(this, "您查询的表为空表！", "系统提示", JOptionPane.WARNING_MESSAGE);
            }
            rs.beforeFirst();
            String[][] ob = new String[k][7];
            for (int i = 0; i < k && rs.next(); i++) {
                ob[i][0] = rs.getString("state");
                ob[i][1] = rs.getString("id");
                ob[i][2] = rs.getString("name");
                ob[i][3] = rs.getString("telephone");
                ob[i][4] = rs.getString("mail");
                ob[i][5] = rs.getString("date");
            }
            String[] st1 = {"状态", "账务账号", "姓名", "电话", "邮箱", "日期"};
            m_view = new JTable(ob, st1);
            m_view.setSize(700, 700);
            m_view.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            JScrollPane jsp = new JScrollPane(m_view);
            jsp.setPreferredSize(new Dimension(m_view.getWidth() - 300, m_view.getHeight() - 300));
            p3 = new JPanel(new FlowLayout());
            p1.add(p3, "Center");
            p3.add(jsp);
            this.add(p1);
            this.setVisible(true);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
