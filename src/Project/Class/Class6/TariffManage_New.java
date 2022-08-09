package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TariffManage_New extends JPanel implements ActionListener {

    private JPanel p1,p2,p3;
    private JTable jt;
    private JTextField[] j1 = new JTextField[4];
    private JLabel[] jl1 = new JLabel[4], jl2 = new JLabel[4];
    private JButton b1, b2;

    public TariffManage_New(){
        this.setLayout(new BorderLayout());
        p1 = new JPanel(new GridLayout(4, 3));
        String[] st1 = {"资费名称", "月租费用", "每小时费用", "资费描述"};
        String[] st2 = {"", "更改月租费用", "更改每小时费用", "更改资费描述"};

        for (int i = 0; i < 4; i++) {
            jl1[i] = new JLabel(st1[i]);
            p1.add(jl1[i]);

            j1[i] = new JTextField();
            p1.add(j1[i]);

            jl2[i] = new JLabel(st2[i]);
            p1.add(jl2[i]);
            this.add(p1, "Center");
        }

        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        b1 = new JButton("修改");
        p2.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("重设");
        p2.add(b2);
        b2.addActionListener(this);

        this.add(p2, "South");
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Connection con;
                Statement stmt;
                con = DBAPI.getConnection();
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM sourse");

                String s1, s2;
                s1 = j1[0].getText();
                s2 = "月租" + j1[1].getText() + "元" + "," + "每小时" + j1[2].getText() + "元";
                j1[3].setText(s2);
                int message = 0;
                while (rs.next()) {
                    if (s1.equals(rs.getString("name"))) {
                        message = 1;
                        stmt.executeUpdate("UPDATE sourse SET name='" + s1 + "',month_rent='" + j1[1].getText() + "',hour_spent='" +
                                j1[2].getText() + "',introduce='" + s2 + "'WHERE name='" + s1 + "'");
                        break;
                    }
                }
                if (message==0)
                    JOptionPane.showMessageDialog(this, "对不起！此用户不存在！请重新输入！", "系统提示", JOptionPane.INFORMATION_MESSAGE);
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
